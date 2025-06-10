#include <Keypad.h>
#include <LiquidCrystal.h>

// Inicializa LCD
LiquidCrystal lcd(7, 6, 5, 4, 3, 2);

// Teclado 4x4
const byte ROWS = 4;
const byte COLS = 4;
char keys[ROWS][COLS] = {
  {'1','2','3','A'},
  {'4','5','6','B'},
  {'7','8','9','C'},
  {'*','0','#','D'}
};

byte rowPins[ROWS] = {A0, A1, A2, A3};
byte colPins[COLS] = {A4, A5, 8, 9};
Keypad keypad = Keypad(makeKeymap(keys), rowPins, colPins, ROWS, COLS);

// Relé e LED
const int rele = 10;
const int ledErro = 11;

// Senha e controle
String senhaCorreta = "1111";
String entradaUsuario = "";
int tentativas = 0;
const int maxTentativas = 3;
unsigned long tempoBloqueio = 30000; // 30 segundos
unsigned long tempoInicioBloqueio = 0;
bool bloqueado = false;

void setup() {
  lcd.begin(16, 2);
  pinMode(rele, OUTPUT);
  pinMode(ledErro, OUTPUT);
  digitalWrite(rele, LOW);
  digitalWrite(ledErro, LOW);
  lcd.print("Digite a senha:");
}

void loop() {
  if (bloqueado) {
    // Verifica se o tempo de bloqueio acabou
    if (millis() - tempoInicioBloqueio >= tempoBloqueio) {
      bloqueado = false;
      tentativas = 0;
      lcd.clear();
      lcd.print("Digite a senha:");
    } else {
      lcd.setCursor(0, 1);
      lcd.print("Acesso bloqueado");
      return; // Não permite digitar
    }
  }

  char tecla = keypad.getKey();

  if (tecla) {
    if (tecla == '#') {
      lcd.clear();
      if (entradaUsuario == senhaCorreta) {
        lcd.print("Destravado!");
        digitalWrite(rele, HIGH);
        delay(3000);
        digitalWrite(rele, LOW);
        tentativas = 0; // Reseta após sucesso
      } else {
        tentativas++;
        lcd.print("Senha incorreta");
        digitalWrite(ledErro, HIGH);
        delay(3000);
        digitalWrite(ledErro, LOW);
        
        if (tentativas >= maxTentativas) {
          bloqueado = true;
          tempoInicioBloqueio = millis();
          lcd.clear();
          lcd.print("Bloqueado 30s");
          return;
        }
      }
      entradaUsuario = "";
      lcd.clear();
      lcd.print("Digite a senha:");
    } else if (tecla == '*') {
      entradaUsuario = "";
      lcd.clear();
      lcd.print("Digite a senha:");
    } else if (entradaUsuario.length() < 6 && isDigit(tecla)) {
      entradaUsuario += tecla;
      lcd.setCursor(0, 1);
      lcd.print(entradaUsuario);
    }
  }
}

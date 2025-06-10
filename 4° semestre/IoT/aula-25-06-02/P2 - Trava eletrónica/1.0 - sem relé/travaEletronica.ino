#include <Keypad.h>
#include <LiquidCrystal.h>

// LCD (RS, E, D4, D5, D6, D7)
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

// Pinos do teclado
byte rowPins[ROWS] = {A0, A1, A2, A3};
byte colPins[COLS] = {A4, A5, 8, 9};
Keypad keypad = Keypad(makeKeymap(keys), rowPins, colPins, ROWS, COLS);

// LEDs
const int ledVermelho = 10;
const int ledVerde = 11;

// Senha
String senhaCorreta = "123456";
String entradaUsuario = "";

void setup() {
  lcd.begin(16, 2);
  pinMode(ledVermelho, OUTPUT);
  pinMode(ledVerde, OUTPUT);
  lcd.print("Digite a senha:");
}

void loop() {
  char tecla = keypad.getKey();

  if (tecla) {
    if (tecla == '#') { // Enviar
      if (entradaUsuario == senhaCorreta) {
        lcd.clear();
        lcd.print("Destravado!");
        digitalWrite(ledVerde, HIGH);
        digitalWrite(ledVermelho, LOW);
      } else {
        lcd.clear();
        lcd.print("Senha incorreta");
        digitalWrite(ledVermelho, HIGH);
        digitalWrite(ledVerde, LOW);
      }

      entradaUsuario = ""; // limpa entrada
      delay(2000);
      lcd.clear();
      lcd.print("Digite a senha:");
    }
    else if (tecla == '*') { // Limpar entrada
      entradaUsuario = "";
      lcd.clear();
      lcd.print("Digite a senha:");
    }
    else if (entradaUsuario.length() < 6 && isDigit(tecla)) {
      entradaUsuario += tecla;
      lcd.setCursor(0, 1);
      lcd.print(entradaUsuario);
    }
  }
}

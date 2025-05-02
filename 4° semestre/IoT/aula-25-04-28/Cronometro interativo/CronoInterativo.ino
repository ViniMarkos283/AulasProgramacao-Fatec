#include <LiquidCrystal.h>

// Pinos do LCD
const int rs = 12, en = 11, d4 = 4, d5 = 5, d6 = 6, d7 = 7;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);

// Pinos dos botões
const int botaoStartPause = 8;
const int botaoReset = 9;

// Variáveis do cronômetro
unsigned long previousMillis = 0;
int segundos = 0;
int minutos = 0;
bool rodando = false;

// Controle de estado dos botões (para evitar múltiplos cliques por bouncing)
bool ultimoEstadoStart = LOW;
bool ultimoEstadoReset = LOW;

void setup() {
  lcd.begin(16, 2);
  lcd.print("Cronometro:");

  pinMode(botaoStartPause, INPUT);
  pinMode(botaoReset, INPUT);
}

void loop() {
  unsigned long currentMillis = millis();

  // Leitura dos botões
  bool estadoStart = digitalRead(botaoStartPause);
  bool estadoReset = digitalRead(botaoReset);

  // Alterna entre start/pause
  if (estadoStart == HIGH && ultimoEstadoStart == LOW) {
    rodando = !rodando;
    delay(200);  // debounce simples
  }
  ultimoEstadoStart = estadoStart;

  // Reset
  if (estadoReset == HIGH && ultimoEstadoReset == LOW) {
    segundos = 0;
    minutos = 0;
    previousMillis = currentMillis;
    lcd.setCursor(0, 1);
    lcd.print("00:00     ");
    delay(200);  // debounce simples
  }
  ultimoEstadoReset = estadoReset;

  // Atualiza tempo se estiver rodando
  if (rodando && (currentMillis - previousMillis >= 1000)) {
    previousMillis = currentMillis;

    segundos++;
    if (segundos >= 60) {
      segundos = 0;
      minutos++;
    }

    // Atualiza o LCD
    lcd.setCursor(0, 1);
    if (minutos < 10) lcd.print("0");
    lcd.print(minutos);
    lcd.print(":");
    if (segundos < 10) lcd.print("0");
    lcd.print(segundos);
    lcd.print("     "); // limpa resíduos
  }
}

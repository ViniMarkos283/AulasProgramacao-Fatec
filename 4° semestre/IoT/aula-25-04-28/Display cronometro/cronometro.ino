#include <LiquidCrystal.h>

// Configuração dos pinos do LCD
const int rs = 12, en = 11, d4 = 7, d5 = 6, d6 = 5, d7 = 4;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);

// Variáveis para o cronômetro
unsigned long previousMillis = 0;
int segundos = 0;
int minutos = 0;

void setup() {
  lcd.begin(16, 2);   // Inicializa o LCD 16x2
  lcd.print("Cronometro:");
}

void loop() {
  unsigned long currentMillis = millis();
  
  if (currentMillis - previousMillis >= 1000) { // Atualiza a cada 1 segundo
    previousMillis = currentMillis;
    
    segundos++;
    if (segundos >= 60) {
      segundos = 0;
      minutos++;
    }
    
    // Escreve o tempo no LCD
    lcd.setCursor(0, 1);  // Começa na linha de baixo
    if (minutos < 10) lcd.print("0");
    lcd.print(minutos);
    lcd.print(":");
    if (segundos < 10) lcd.print("0");
    lcd.print(segundos);
  }
}

// Programa: Teste de Display LCD 16 x 2 com Sensor de Temperatura
// Autor: FILIPEFLOP + ChatGPT combo!

#include <LiquidCrystal.h>

// Define os pinos do display LCD
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

// Define o pino do sensor de temperatura
const int pinoSensor = A0;

void setup() {
  // Inicializa o LCD com 16 colunas e 2 linhas
  lcd.begin(16, 2);
}

void loop() {
  // Faz a leitura do sensor
  int leitura = analogRead(pinoSensor);

  // Converte para temperatura em graus Celsius (assumindo LM35)
  float temperatura = leitura * (5.0 / 1023.0) * 100;

  // Limpa o display
  lcd.clear();

  // Exibe a mensagem na primeira linha
  lcd.setCursor(0, 0);
  lcd.print("Temp: ");
  lcd.print(temperatura, 1); // mostra com 1 casa decimal
  lcd.print((char)223); // símbolo de grau
  lcd.print("C");

  // Exibe algo na segunda linha (pode personalizar)
  lcd.setCursor(0, 1);
  lcd.print("Hello world!");

  delay(2000); // atualiza a cada 2 segundos
}

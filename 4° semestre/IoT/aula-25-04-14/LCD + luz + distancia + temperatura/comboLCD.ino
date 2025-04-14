// Programa: Exibição de Temperatura, Luminosidade e Distância no LCD

#include <LiquidCrystal.h>

// Define os pinos do display LCD
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

// Sensor de temperatura (LM35)
const int pinoTemp = A0;

// Sensor de luminosidade (LDR)
const int pinoLDR = A3;

// Sensor ultrassônico (HC-SR04)
const int trigPin = 7;
const int echoPin = 6;

void setup() {
  lcd.begin(16, 2);

  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
}

void loop() {
  // Leitura da temperatura
  int leituraTemp = analogRead(pinoTemp);
  float temperatura = leituraTemp * (5.0 / 1023.0) * 100;

  // Leitura da luminosidade
  int leituraLDR = analogRead(pinoLDR);
  float percentualLum = (1 - (leituraLDR / 1023.0)) * 100;

  // Leitura da distância
  long duracao;
  float distancia;

  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);

  duracao = pulseIn(echoPin, HIGH);
  distancia = duracao * 0.034 / 2; // conversão para cm

  // Exibe temperatura
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Temp: ");
  lcd.print(temperatura, 1);
  lcd.print((char)223);
  lcd.print("C");

  lcd.setCursor(0, 1);
  lcd.print("Temp. ambiente");
  delay(5000);

  // Exibe luminosidade
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Luz: ");
  lcd.print(percentualLum, 0);
  lcd.print("%");

  lcd.setCursor(0, 1);
  lcd.print("Percent. de luz");
  delay(5000);

  // Exibe distância
  lcd.clear();
  lcd.setCursor(0, 0);
  lcd.print("Dist: ");
  lcd.print(distancia, 1);
  lcd.print(" cm");

  lcd.setCursor(0, 1);
  lcd.print("Objeto + proximo");
  delay(5000);
}

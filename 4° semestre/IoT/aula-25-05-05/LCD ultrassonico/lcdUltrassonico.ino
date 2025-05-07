#include <LiquidCrystal.h>

// Pinos do HC-SR04
const int trigPin = 9;
const int echoPin = 8;

// Inicializa o LCD com os pinos conectados
LiquidCrystal lcd(12, 11, 4, 5, 6, 7);

void setup() {
  // Configura os pinos do sensor ultrassônico
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  
  // Inicia o LCD
  lcd.begin(16, 2);
  lcd.print("Distancia:");
}

void loop() {
  // Gera pulso no pino trigger
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  
  // Leitura do tempo de retorno
  long duration = pulseIn(echoPin, HIGH);
  
  // Calcula a distância em centímetros
  float distance = duration * 0.034 / 2;

  // Limpa a segunda linha do LCD e imprime a distância
  lcd.setCursor(0, 1);
  lcd.print(distance);
  lcd.print(" cm   "); // Espaços extras para limpar restos
  delay(500);
}

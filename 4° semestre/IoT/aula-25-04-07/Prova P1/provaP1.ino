// Pinos dos LEDs
const int redLEDs[] = {13, 12, 11};
const int yellowLEDs[] = {8, 9, 10};

// Sensor de temperatura (TMP36)
const int tempPin = A0;

// Sensor de luminosidade (LDR)
const int ldrPin = A1;

// Sensor ultrassônico (HC-SR04)
const int trigPin = 5;
const int echoPin = 4;

// Buzzer
const int buzzerPin = 7;

void setup() {
  Serial.begin(9600);

  // Configurar pinos dos LEDs como saída
  for (int i = 0; i < 3; i++) {
    pinMode(redLEDs[i], OUTPUT);
    pinMode(yellowLEDs[i], OUTPUT);
  }

  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT);
  pinMode(buzzerPin, OUTPUT);
}

void loop() {
  // ----- SENSOR DE TEMPERATURA -----
  int tempValue = analogRead(tempPin);
  float voltage = tempValue * (5.0 / 1023.0);
  float temperatureC = (voltage - 0.5) * 100;

  // Acionar LEDs vermelhos conforme a temperatura
  int tempLevel = 0;
  if (temperatureC >= 25) tempLevel = 1;
  if (temperatureC >= 30) tempLevel = 2;
  if (temperatureC >= 35) tempLevel = 3;
  for (int i = 0; i < 3; i++) {
    digitalWrite(redLEDs[i], i < tempLevel ? HIGH : LOW);
  }

  // ----- SENSOR DE LUMINOSIDADE -----
  int ldrValue = analogRead(ldrPin);

  // Acionar LEDs amarelos conforme a luminosidade
  int lightLevel = 0;
  if (ldrValue > 800) lightLevel = 1;
  if (ldrValue > 900) lightLevel = 2;
  if (ldrValue > 1000) lightLevel = 3;
  for (int i = 0; i < 3; i++) {
    digitalWrite(yellowLEDs[i], i < lightLevel ? LOW : HIGH);
  }

  // ----- SENSOR ULTRASSÔNICO -----
  long duration;
  digitalWrite(trigPin, LOW);
  delayMicroseconds(2);
  digitalWrite(trigPin, HIGH);
  delayMicroseconds(10);
  digitalWrite(trigPin, LOW);
  duration = pulseIn(echoPin, HIGH);

  float distance = duration * 0.034 / 2;

  if (distance < 20.0) {
    digitalWrite(buzzerPin, HIGH);
  } else {
    digitalWrite(buzzerPin, LOW);
  }
  
  delay(500);

Serial.print("Temp (°C): ");
Serial.print(temperatureC);
Serial.print(" | LDR: ");
Serial.print(ldrValue);
Serial.print(" | Distância (cm): ");
Serial.println(distance);

}

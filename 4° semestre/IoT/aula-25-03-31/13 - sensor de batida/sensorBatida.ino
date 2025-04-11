// Projeto 13 – Sensor de batida piezo
int ledPin = 9; // LED no pino digital 9
int piezoPin = 5; // Piezo no pino analógico 5
int threshold = 120; // O valor do sensor a ser atingido antes da ativação
int sensorValue = 0; // Uma variável para armazenar o valor lido do sensor
float ledValue = 0; // O brilho do LED
void setup() {
pinMode(ledPin, OUTPUT); // Define o ledPin como OUTPUT
// Pisca o LED duas vezes, para mostrar que o programa iniciou
digitalWrite(ledPin, HIGH); delay(150); digitalWrite(ledPin, LOW); delay(150);
digitalWrite(ledPin, HIGH); delay(150); digitalWrite(ledPin, LOW); delay(150);
}
void loop() {
sensorValue = analogRead(piezoPin); // Lê o valor do sensor
if (sensorValue >= threshold) { // Se uma batida for detectada, defina o brilho como máximo
ledValue = 255;
}
analogWrite(ledPin, int(ledValue) ); // Escreve o valor de brilho no LED
ledValue = ledValue - 0.05; // Apaga o LED lentamenteif (ledValue <= 0) { ledValue = 0;}
// Certifica-se de que o valor não descerá abaixo de zero
}
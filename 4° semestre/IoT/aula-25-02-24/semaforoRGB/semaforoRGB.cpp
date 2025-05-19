// Arduino: semaforo
// C++ code

int ledDelay = 1000; // espera entre as alterações
int redPin = 10;
int bluePin = 9;
int greenPin = 8;

void setup()
{
  pinMode(redPin, OUTPUT);
  pinMode(bluePin, OUTPUT);
  pinMode(greenPin, OUTPUT);
}

void loop() {
digitalWrite(redPin, HIGH); // acende a luz vermelha
delay(ledDelay); 
  
digitalWrite(bluePin, LOW); // acende a luz amarela
digitalWrite(greenPin, HIGH); // acende a luz verde
delay(500); 
  
digitalWrite(bluePin, LOW); // acende a luz amarela
digitalWrite(redPin, LOW);
digitalWrite(greenPin, HIGH); // apaga a luz verde
delay(1000);
  
digitalWrite(greenPin, LOW);
// agora nosso loop se repete
}
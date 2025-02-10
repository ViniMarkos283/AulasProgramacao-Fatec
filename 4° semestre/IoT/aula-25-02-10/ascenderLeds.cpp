// Arduino
// Projeto led piscante

int ledPin = 13; // variavel led q recebe a porta 13 (pino do led fisico)
void setup() // como inicia
{
  pinMode(ledPin, OUTPUT); // diz q nosso led está num pino de saida
}

void loop() // como funciona (em repetição)
{
  digitalWrite(ledPin, HIGH); // ascende o led
  delay(1000); // mantem aceso por 1 segundo
  digitalWrite(ledPin, LOW); // apaga o led
  delay(1000); 
}
// Arduino: sinal em codigo morse SOS
// C++ code
void setup()
{
  pinMode(10, OUTPUT); // start com o pino na porta 10
}

void loop()
{
  for(int x=0;x<3;x++){ // faz rodar cada sinal 3 vezes
  	digitalWrite(10, HIGH); // liga
  	delay(250);
  	digitalWrite(10, LOW); // desliga
  	delay(100);
  }
  
    delay(200); // tempo entre as letras
  
  for(int x=0;x<3;x++){
  	digitalWrite(10, HIGH);
  	delay(400);
  	digitalWrite(10, LOW);
  	delay(100);
  }
  
  delay(200);
  
    for(int x=0;x<3;x++){
  	digitalWrite(10, HIGH);
  	delay(250);
  	digitalWrite(10, LOW);
  	delay(100);
  }
  delay(1000); // tempo até reiniciar o sinal
}
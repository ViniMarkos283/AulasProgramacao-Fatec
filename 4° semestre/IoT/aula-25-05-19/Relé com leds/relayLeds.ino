// Pinos
const int buttonPin = 3;     // Pino onde o botão está conectado
const int relayPin = 2;      // Pino onde o relé (e LED) está conectado

// Variáveis de estado
int ledState = LOW;          
int buttonState;             
int lastButtonState = LOW;   

// Debounce
unsigned long lastDebounceTime = 0;  
unsigned long debounceDelay = 50;    

void setup() {
  pinMode(buttonPin, INPUT);
  pinMode(relayPin, OUTPUT);

  digitalWrite(relayPin, ledState);
}

void loop() {
  int reading = digitalRead(buttonPin);

  if (reading != lastButtonState) {
    lastDebounceTime = millis();  // reseta o tempo do debounce
  }

  if ((millis() - lastDebounceTime) > debounceDelay) {
    if (reading != buttonState) {
      buttonState = reading;

      // Se o botão foi pressionado (estado HIGH)
      if (buttonState == HIGH) {
        ledState = !ledState;  // Inverte o estado
        digitalWrite(relayPin, ledState);
      }
    }
  }

  lastButtonState = reading;
}

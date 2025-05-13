#include <Keypad.h>

const byte ROWS = 4;
const byte COLS = 4;
char keys[ROWS][COLS] = {
  {'1', '2', '3', 'A'},
  {'4', '5', '6', 'B'},
  {'7', '8', '9', 'C'},
  {'*', '0', '#', 'D'}
};

byte rowPins[ROWS] = {11, 10, 9, 8};    // Linhas do teclado
byte colPins[COLS] = {7, 6, 5, 4};  // Colunas do teclado

Keypad keypad = Keypad(makeKeymap(keys), rowPins, colPins, ROWS, COLS);

// Pinos dos LEDs
int ledPins[] = {2, 3, 12, 13, A0, A1, A2, A3, A4};
int numLeds = sizeof(ledPins) / sizeof(ledPins[0]);

void setup() {
  for (int i = 0; i < numLeds; i++) {
    pinMode(ledPins[i], OUTPUT);
    digitalWrite(ledPins[i], LOW);
  }
}

void acendeLeds(int quantidade) {
  for (int i = 0; i < numLeds; i++) {
    if (i < quantidade) {
      digitalWrite(ledPins[i], HIGH);
    } else {
      digitalWrite(ledPins[i], LOW);
    }
  }
}

void loop() {
  char key = keypad.getKey();
  
  if (key >= '1' && key <= '9') {
    acendeLeds(key - '0'); // Converte o caractere numérico para inteiro
  } else if (key == '0') {
    acendeLeds(0); // Desliga todos
  }
}

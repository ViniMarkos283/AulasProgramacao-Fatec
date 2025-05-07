// Exemplo 11 – Display de 7 segmentos + Teclado de membrana
// Apostila Eletrogate - KIT MAKER
// Gustavo Murta
#include <Keypad.h>
#include <SegmentDisplay.h>
// biblioteca Keypad
// biblioteca SegmentDisplay
SegmentDisplay segmentDisplay(A0, A1, A2, A3, A4, A5, 12, 13);
// definição das portas para segmentos do display
// A0=E A1=D A2=C A3=D A4=B A5=A D12=F D13=G
const byte ROWS = 4;
const byte COLS = 4;
// Keypad 4 linhas
// Keypad 4 colunas
char hexaKeys[ROWS][COLS] =
{
{'1', '2', '3', 'A'},
{'4', '5', '6', 'B'},
{'7', '8', '9', 'C'},
{'F', '0', 'E', 'D'}
};
// definição dos caracteres do Keypad
// alterações *=F e #=E
byte rowPins[ROWS] = {11, 10, 9, 8};
byte colPins[COLS] = {7, 6, 5, 4};
// portas D11 a D8 => linhas do Keypad
// portas D7 a D4 => colunas do Keypad
Keypad customKeypad = Keypad( makeKeymap(hexaKeys), rowPins, colPins, ROWS,
COLS); // inicializa o Keypad
void setup()
{
Serial.begin(9600); // console serial 9600 Bps
// definições das portas analógicas A0 a A5 como portas digitais de saidas
pinMode(A0, OUTPUT
pinMode(A1, OUTPUT);
pinMode(A2, OUTPUT);
pinMode(A3, OUTPUT);
pinMode(A4, OUTPUT);
pinMode(A5, OUTPUT);
}
void loop()
{
char customKey = customKeypad.getKey(); // leitura da tecla pressionada
int number = customKey - 48; // converte o caracter em um número
if ((number > 16) && (number < 23)) number = number - 7;
// se numero for entre 17 e 22 subtraia 7 (numeros hexadecimais)
if (customKey)
{
// se tecla for pressionada
segmentDisplay.displayHex(number, false);
// mostra o caracter no display sem o ponto decimal
Serial.println(number);
// imprime o numero na console serial (para teste)
}
}
// Projeto 7 – Lâmpada pulsante
int ledPin = 11;            // led conectado ao pino 11
float sinVal;               // variavel flutuante 
int ledVal;                 // inteiro led valor

void setup() {
pinMode(ledPin, OUTPUT);    // pino em modo de saida
}

void loop() {
for (int x=0; x<180; x++) {             // vai de zero até 180, subindo de um por um
// converte graus para radianos e, então, obtém o valor do seno
    sinVal = (sin(x*(3.1416/180)));     // o sinal valor é um x multiplicado por um PI dividido por 180
    ledVal = int(sinVal*255);           // o ledval é multiplicado por 255 (8 bits ou 2⁸)
    analogWrite(ledPin, ledVal);        // função responsavel por criar a variação de brilho do led
    delay(25);
    }
}
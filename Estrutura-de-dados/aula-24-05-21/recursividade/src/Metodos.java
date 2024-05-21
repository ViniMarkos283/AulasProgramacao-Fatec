public class Metodos {
    public static int metodoB(int n, int m) { // faz a somatoria dos numeros no intervalo de M até o N
        if (m > n) { // se o M for maior, zera
            return 0;
        }
        if (m == n) { // se forem iguais, retorna um deles
            return n;
        }
        return (metodoB(n - 1, m + 1) + (n + m)); // retorna a chamada do proprio metodo com mudanças nos valores até q
                                                  // uma das codições acima seja atendida, depois soma tudo e devolve
    }

    public static int metodoF(int v[], int n) {
        if (n == 0) {
            return 0;
        }
        int s;
        s = metodoF(v, n - 1);
        if (v[n - 1] > 0)
            s = s + v[n - 1];
        return s;
    }

    public static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

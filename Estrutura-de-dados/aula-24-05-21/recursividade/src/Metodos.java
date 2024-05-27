public class Metodos {
    public int metodoB(int n, int m) { // faz a somatoria dos numeros no intervalo de M até o N
        if (m > n) { // se o M for maior, zera
            return 0;
        }
        if (m == n) { // se forem iguais, retorna um deles
            return n;
        }
        return (metodoB(n - 1, m + 1) + (n + m)); // retorna a chamada do proprio metodo com mudanças nos valores até q
                                                  // uma das codições acima seja atendida, depois soma tudo e devolve
    }

    public int metodoF(int v[], int n) {
        if (n == 0) {
            return 0;
        }
        int s;
        s = metodoF(v, n - 1);
        if (v[n - 1] > 0)
            s = s + v[n - 1];
        return s;
    }

    public int fibonacci(int n) { // metodo fibonacci
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int mdc(int m, int n) { // minimo divisor comum...
        int r = m % n; // resto da divisão
        if (r != 0) {
            return mdc(n, r); // retorna o metodo com os valores alterados até q o resto seja zero
        }
        return n; // retorna o divisor

    }

    public void fibo(int n, int v[]) { // outro jeito de fazer o metodo do fibonacci (acho o primeiro mais facil)
        if (n == 1) {
            v[n - 1] = 1; // se o N for 1...
        } else {
            fibo(n - 1, v);
            if (n == 2) { // se N for 2...
                v[n - 1] = 1;
            } else { // senão, faz a conta normalmente
                v[n - 1] = v[n - 3] + v[n - 2];
            }
        }
    }
}

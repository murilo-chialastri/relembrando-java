package semana1.dia1.dia3;

public class main {

    static int maiorDoArray(int [] numeros) {
        int maior = numeros[0];
        for (int n: numeros) {
            if (maior < n) {
                maior = n;
            }
        }
        return maior;
    }

    static int buscarUltimaPosicao(int[] numeros, int alvo) {
        int cont = 0;
//        for (int n: numeros ) {
//            if (alvo == n) {
//                return cont;
//            } else {
//                cont ++;
//            }
//        }
        for (int i = numeros.length -1; i >= 0 ; i--) {
            if (numeros[i] == alvo) {
                return i;
            }
        }
        return -1;
    }

    static double calcularMedia(int [] numeros) {
        int res = 0;
        for (int n: numeros) {
            res += n;
        }
        double media = (double) res/numeros.length;
        return media ;

    }
    static int contarAcimaDaMedia(int[] numeros) {
        int cont = 0;
        double media = calcularMedia(numeros);
        for (int n: numeros) {
            if (n > media) {
                cont++;
            }
        }
        return cont;
    }

    static void main() {
        int[] valores = {3, 5, 4, 5, 7};
        int[] num = {4, 9, 2, 7, 2};
        System.out.println(maiorDoArray(num));
        System.out.println(buscarUltimaPosicao(num, 2));
        System.out.println(calcularMedia(num));
        System.out.println(contarAcimaDaMedia(valores));


    }
}

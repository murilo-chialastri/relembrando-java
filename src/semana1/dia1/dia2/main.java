package semana1.dia1.dia2;

public class main {

    static int dobrar (int a) {
        return a *= a;
    }
    static boolean ePar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static int maior (int a, int b){
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    static int contarPares (int [] numeros) {
        int contador = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (ePar(i) == true){
                contador ++;
            }

        }
        return contador;
    }

    static void repetirMsg(String msg, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.println(msg);
        }
    }

    static int somarImpares(int [] numeros) {
        int res = 0;
        for (int n:numeros) {
            if (!ePar(n)) {
                res += n;
            }
        }
        return res;
    }

    static int buscar(int[] numeros, int alvo) {
        int res = -1;
        if (alvo < numeros.length) {
            for (int i = 0; i <= alvo ; i++) {
                res = numeros[i];
            }

        }
        return res;
    }

    static void main() {
        int [] numeros = {2, 5, 8, 9, 12};
        System.out.println(ePar(2));
        System.out.println(dobrar(2));
        System.out.println(maior(4,6));
        repetirMsg("ola mundo", 3);
        System.out.println(contarPares(numeros));
        System.out.println(somarImpares(numeros));
        System.out.println(buscar(numeros, 23));

    }
}

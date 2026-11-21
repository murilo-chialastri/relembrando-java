package semana1.dia1;

public class main {

    static void main() {
        String nomeLivro = "Código Limpo";
        int paginas = 120;
        double peso = 1.2;
        boolean disponivel = true;

        System.out.printf("Nome: %s, Páginas: %d, Peso: %.1f kg, Disponivel: %b ",nomeLivro, paginas, peso, disponivel);

        int dia1 = 20;
        int dia2 = 20;
        int dia3 = 45;
        int meta = 120;
        int extra = 25;
        int total = dia1+ dia2 + dia3;
        if (total >= meta) {
            System.out.printf("\nparabens, atingiu a meta de %d minutos, você estudou por %d minutos\n", meta, total);
        } else {
            int faltando = meta - total;
            double aulas = (double) faltando / extra;
            int aula = (int) Math.ceil(aulas);

            System.out.printf("\nVocê não atingiu a meta de %d minutos, você estudou por %d minutos, deve fazer %d aulas extra\n", meta, total, aula);
        }


        double conta = 7%2;
        System.out.println(conta);
    }
}

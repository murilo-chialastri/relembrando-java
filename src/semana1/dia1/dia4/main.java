package semana1.dia1.dia4;

import java.util.Locale;

public class main {

    static int contarDisponiveis(Produto[] produtos) {
        int quant = 0;
        for (Produto p : produtos) {
            if (p.getEstoque() > 0) {
                quant++;
            }
        }
        return quant;
    }

    static Produto buscarPorNome(Produto[] produtos, String nome) {
        nome = nome.toLowerCase();
        for (Produto p : produtos) {
            if (p.getNome().toLowerCase() == nome) {
                return p;
            }
        }
        return null;
    }

    static boolean venderPorNome(Produto[] produtos, String nome, int quantidade) {

        Produto produto = buscarPorNome(produtos, nome);
        if (produto != null) {
            if (produto.vender(quantidade) == true){
                return true;
            }
        }
        return false;

    }

    static void main() {
        Produto camisa = new Produto("camisa",0);
        Produto produto = new Produto("lapis",3);
        Produto caderno = new Produto("caderno", 4);
        Produto[] produtos = {produto, caderno, camisa};
        produto.repor(4);
        System.out.println(produto);
        System.out.println(produto.getEstoque());
        System.out.println(produto.vender(23));
        System.out.println(produto.getEstoque());
        System.out.println(contarDisponiveis(produtos));
        System.out.println(buscarPorNome(produtos, "lapis"));
        System.out.println(produto.getEstoque());
        System.out.println(venderPorNome(produtos, "lapis", 2));
        System.out.println(produto.getEstoque());
    }
}

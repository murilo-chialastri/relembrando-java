package semana1.dia1.dia5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main {


    static int contarDisponiveis(List<Produto> produtos) {
        int quant = 0;
        for (Produto p : produtos) {
            if (p.getEstoque() > 0) {
                quant++;
            }
        }
        return quant;
    }

    static boolean venderPorId(Map<Integer, Produto> produtos, int id, int quantidade) {
        try {
            Produto produto = produtos.get(id);
            if (produto.vender(quantidade)) {

                return true;
            }
            return false;
        } catch (NullPointerException e){
            return false;
        }


    }


    static void main(String[] args) {
        //no array você usa numeros.length e numeros[i]. Na lista, usa produtos.size() e produtos.get(i)
        List<Produto> produtos = new ArrayList<>();
        produtos.add( new Produto("caderno", 4));
        produtos.add( new Produto("camisa", 0));

        System.out.println(produtos.size());
        System.out.println(produtos.get(0).getNome());
        System.out.println(contarDisponiveis(produtos));

        Map<Integer, Produto> produtosPorId = new HashMap<>();  // usando um id para mapear
        produtosPorId.put(1, new Produto("livro", 4));
        produtosPorId.put(2, new Produto("tenis", 14));
        produtosPorId.put(3, new Produto("meia", 1));

        Produto encontrado = produtosPorId.get(1);
        System.out.println(encontrado);
        System.out.println(produtosPorId.get(2));
        System.out.println(venderPorId(produtosPorId, 2, 10));
        System.out.println(produtosPorId.get(2));


    }
}

package semana1.dia1.dia5;

import java.util.TreeMap;

public class Produto {
    private String nome;
    private int estoque;

    Produto(String nome,int estoque) {
        this.nome = nome;
        this.estoque = estoque;
    }

    void repor(int quantidade) {
        estoque += quantidade;
    }

    boolean vender(int quantidade){
        if (quantidade <= estoque) {
            estoque -= quantidade;
            return true;
        } else {
            return false;
        }
    }

    int getEstoque() {
        return estoque;
    }
    String getNome() {
        return nome;
    }
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", estoque=" + estoque +
                '}';
    }
}

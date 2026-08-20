package br.com.fiapride.model;

public class Garrafa {
    public String cor;
    public String material;
    public int capacidadeEmMl;
    public int nivelAtualMl;

    public void encher(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero!");
            return;
        }

        if (nivelAtualMl + quantidade > capacidadeEmMl) {
            System.out.println("Erro: a garrafa vai transbordar!");
            return;
        }

        nivelAtualMl += quantidade;
        System.out.println("Nível atual: " + nivelAtualMl + "ml");
    }

    public void beber(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero!");
            return;
        }

        if (quantidade > nivelAtualMl) {
            System.out.println("Erro: não tem líquido suficiente!");
            return;
        }

        nivelAtualMl -= quantidade;
        System.out.println("Nível atual: " + nivelAtualMl + "ml");
    }
}

package br.com.fiapride.model;

public class PetVirtual {

    public String nome;
    public int fome;
    public int energia;

    public void alimentar(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero!");
            return;
        }

        if (quantidade > fome) {
            System.out.println("Erro: o pet não está com tanta fome!");
            return;
        }

        fome -= quantidade;
        System.out.println(nome + " foi alimentado. Fome atual: " + fome);
    }

    public void brincar(int tempo) {
        if (tempo <= 0) {
            System.out.println("Erro: o tempo deve ser maior que zero!");
            return;
        }

        if (tempo > energia) {
            System.out.println("Erro: o pet não tem energia suficiente!");
            return;
        }

        if (fome + tempo > 100) {
            System.out.println("Erro: o pet está com muita fome para brincar!");
            return;
        }

        energia -= tempo;
        fome += tempo;
        System.out.println(nome + " brincou. Energia: " + energia + " | Fome: " + fome);
    }
}

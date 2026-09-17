package br.com.fiapride.model;

public class PetVirtual {

    private String nome;
    private int fome;
    private int energia;
    private Tutor tutor;

    public PetVirtual(String nome, Tutor tutor) {
        setNome(nome);
        setFome(40);
        setEnergia(80);
        this.tutor = tutor;
    }

    public void alimentar(int quantidade) {
        if (quantidade <= 0) {
            System.out.println("Erro: a quantidade deve ser maior que zero!");
            return;
        }

        if (quantidade > fome) {
            System.out.println("Erro: o pet não está com tanta fome!");
            return;
        }

        setFome(fome - quantidade);

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

        setEnergia(energia - tempo);
        setFome(fome + tempo);

        System.out.println(nome + " brincou. Energia: " + energia + " | Fome: " + fome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Erro: o nome não pode ficar vazio!");
            return;
        }

        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        if (fome < 0 || fome > 100) {
            System.out.println("Erro: a fome deve ficar entre 0 e 100!");
            return;
        }

        this.fome = fome;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        if (energia < 0 || energia > 100) {
            System.out.println("Erro: a energia deve ficar entre 0 e 100!");
            return;
        }

        this.energia = energia;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
package br.com.fiapride.main;

import java.util.Scanner;
import br.com.fiapride.model.Garrafa;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Garrafa minhaGarrafa = new Garrafa();

        minhaGarrafa.cor = "Azul";
        minhaGarrafa.material = "Plástico";
        minhaGarrafa.capacidadeEmMl = 500;

        System.out.print("Quanto deseja colocar na garrafa? ");
        int quantidadeEncher = leitor.nextInt();
        minhaGarrafa.encher(quantidadeEncher);

        System.out.print("Quanto deseja beber? ");
        int quantidadeBeber = leitor.nextInt();
        minhaGarrafa.beber(quantidadeBeber);


        System.out.println("\n--- Testes válidos e inválidos ---");

        Garrafa garrafaTeste = new Garrafa();
        garrafaTeste.capacidadeEmMl = 500;

        // Testes válidos
        garrafaTeste.encher(300);
        garrafaTeste.beber(100);

        // Testes inválidos
        garrafaTeste.encher(1000);
        garrafaTeste.beber(9999);

        leitor.close();
    }
}
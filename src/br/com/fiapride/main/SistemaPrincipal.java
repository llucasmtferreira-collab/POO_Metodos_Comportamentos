package br.com.fiapride.main;

import java.util.Scanner;
import br.com.fiapride.model.PetVirtual;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        PetVirtual pet = new PetVirtual();

        pet.setNome("Pixel");
        pet.setFome(40);
        pet.setEnergia(80);

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("\n--- PET VIRTUAL ---");
            System.out.println("1 - Alimentar");
            System.out.println("2 - Brincar");
            System.out.println("3 - Ver status");
            System.out.println("4 - Testar proteção");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {

                System.out.print("Quanto deseja alimentar o " + pet.getNome() + "? ");
                int quantidade = scanner.nextInt();

                pet.alimentar(quantidade);

            } else if (opcao == 2) {

                System.out.print("Por quanto tempo deseja brincar com o " + pet.getNome() + "? ");
                int tempo = scanner.nextInt();

                pet.brincar(tempo);

            } else if (opcao == 3) {

                System.out.println("\n--- STATUS ---");
                System.out.println("Nome: " + pet.getNome());
                System.out.println("Fome: " + pet.getFome());
                System.out.println("Energia: " + pet.getEnergia());

            } else if (opcao == 4) {

                System.out.println("\n--- TESTANDO PROTEÇÃO ---");

                pet.setFome(-20);
                pet.setEnergia(150);
                pet.setNome("");

            } else if (opcao == 0) {

                System.out.println("Até a próxima, " + pet.getNome() + "!");

            } else {

                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
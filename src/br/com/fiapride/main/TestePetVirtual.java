package br.com.fiapride.main;

import br.com.fiapride.model.PetVirtual;
import br.com.fiapride.model.Tutor;

public class TestePetVirtual {

    public static void main(String[] args) {

    	Tutor tutor = new Tutor("Lucas");
    	PetVirtual pet = new PetVirtual("Pixel", tutor);

        System.out.println("--- ESTADO INICIAL ---");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());

        System.out.println("\n--- TESTANDO COMPORTAMENTOS ---");

        System.out.println("Alimentando o pet com 10...");
        pet.alimentar(10);

        System.out.println("Brincando com o pet por 20...");
        pet.brincar(20);

        System.out.println("\n--- TENTANDO BURLAR A PROTEÇÃO ---");

        System.out.println("Tentando colocar fome em -20...");
        pet.setFome(-20);

        System.out.println("Tentando colocar energia em 150...");
        pet.setEnergia(150);

        System.out.println("Tentando deixar o nome vazio...");
        pet.setNome("");

        System.out.println("\n--- ESTADO APÓS OS TESTES INVÁLIDOS ---");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());
    }
}
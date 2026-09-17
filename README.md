# PetVirtual - Projeto Pessoal de POO

A classe `PetVirtual` representa um bichinho virtual inspirado em um Tamagotchi.

O projeto começou com o objeto Garrafa e depois foi alterado para PetVirtual para continuar a evolução nas aulas de Programação Orientada a Objetos.

## Atributos

O PetVirtual possui:

- `nome`
- `fome`
- `energia`
- `tutor`

Os atributos são privados para proteger o estado do objeto.

## Construtor

O PetVirtual recebe o nome e um Tutor no momento em que é criado:

```java
Tutor tutor = new Tutor("Lucas");
PetVirtual pet = new PetVirtual("Pixel", tutor);
```

O pet inicia com:

- fome: 40
- energia: 80

## Métodos

### alimentar(int quantidade)

Diminui a fome do pet e impede valores inválidos.

### brincar(int tempo)

Diminui a energia e aumenta a fome do pet.

### Getters e Setters

Os getters permitem consultar os atributos.

Os setters controlam as alterações e impedem:

- nome vazio;
- fome menor que 0 ou maior que 100;
- energia menor que 0 ou maior que 100.

## Associação com Tutor

Foi criada a classe `Tutor`, que representa o responsável pelo PetVirtual.

Cada PetVirtual possui um Tutor associado.

Exemplo:

```java
Tutor tutor = new Tutor("Lucas");
PetVirtual pet = new PetVirtual("Pixel", tutor);
```

O nome do tutor pode ser consultado com:

```java
pet.getTutor().getNome();
```

## Sistema Principal

O `SistemaPrincipal.java` possui o menu:

1. Alimentar
2. Brincar
3. Ver status
0. Sair

Na opção de status também é exibido o nome do tutor associado ao pet.

## Testes

O `TestePetVirtual.java` testa:

- alimentação;
- brincadeira;
- valores inválidos;
- proteção dos atributos.

## UML

O diagrama UML representa as classes `PetVirtual` e `Tutor` e a associação entre elas.

**Autor:** Lucas Mota - RM566670

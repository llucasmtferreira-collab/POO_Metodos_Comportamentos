# PetVirtual - Projeto Pessoal de POO

A classe `PetVirtual` representa um bichinho virtual inspirado em um Tamagotchi.

O projeto começou com o objeto Garrafa e depois foi alterado para PetVirtual para continuar a evolução nas aulas de Programação Orientada a Objetos.

## Atributos

- `nome`
- `fome`
- `energia`

Os atributos são `private` para proteger o estado do objeto.

## Construtor

O PetVirtual recebe o nome no momento em que é criado:

```java
PetVirtual pet = new PetVirtual("Pixel");
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

## Sistema Principal

O arquivo `SistemaPrincipal.java` possui um menu interativo:

1. Alimentar
2. Brincar
3. Ver status
0. Sair

## Testes

O arquivo `TestePetVirtual.java` testa os comportamentos do objeto e também tenta inserir valores inválidos para verificar se o encapsulamento está funcionando.

Autor: Lucas Mota - RM566670

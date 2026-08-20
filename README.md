# Garrafa - Projeto FiapRide

Projeto simples feito para praticar Programação Orientada a Objetos em Java.

A classe `Garrafa` representa uma garrafa de água do mundo real. Ela guarda algumas características da garrafa e também a quantidade de líquido que existe nela.

## Atributos

- `cor`: cor da garrafa
- `material`: material da garrafa
- `capacidadeEmMl`: capacidade máxima da garrafa
- `nivelAtualMl`: quantidade de líquido que está na garrafa

## Métodos

### encher(int quantidade)

Adiciona líquido na garrafa. O método não deixa colocar uma quantidade menor ou igual a zero e também não deixa ultrapassar a capacidade máxima.

Exemplo:

```java
minhaGarrafa.encher(300);
```

### beber(int quantidade)

Retira líquido da garrafa. O método não deixa usar uma quantidade menor ou igual a zero e também não deixa beber mais líquido do que existe na garrafa.

Exemplo:

```java
minhaGarrafa.beber(100);
```

## Testes

Na classe `SistemaPrincipal` foram feitos testes com valores válidos e inválidos para verificar as regras dos métodos.

## UML

O diagrama da classe está na pasta `uml` e mostra os atributos e os métodos `encher` e `beber`.

Autor: Lucas Mota - RM566670
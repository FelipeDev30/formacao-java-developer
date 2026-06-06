package edu.felipe.tiposdevariaveis;

public class TiposVariaveis {
     public static void main(String [] args){
        byte idade = 123;
        short quantidadeDeDentes = 32;
        int populacaoAtual = 2000000000;
        long populacaoTotal = 1000000000000000000L;
        float preco = 3.5f;
        double precoComVirgula = 3.50;
        char letra = 'A';
        boolean estaAtivo = true;

        System.out.println("Byte: " + idade);
        System.out.println("Short: " + quantidadeDeDentes);
        System.out.println("Int: " + populacaoAtual);
        System.out.println("Long: " + populacaoTotal);
        System.out.println("Float: " + preco);
        System.out.println("Double: " + precoComVirgula);
        System.out.println("Char: " + letra);
        System.out.println("Boolean: " + estaAtivo);

        String nome = "Felipe";
        System.out.println("String: " + nome);
     }
}

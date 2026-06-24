package edu.felipe.variaveis;

public class TiposVariaveis {
     public static void main(String [] args){
        byte idade = 123;
        short ano = 2021;
        int cep = 21770080;
        long cpf = 17172315782L;
        float preco = 329.99f;
        final double PI = 3.14159;   

        System.out.println(idade);
        System.out.println(ano);
        System.out.println(cep);
        System.out.println(cpf);
        System.out.println(preco);
        System.out.println(PI);

        String meuNome = "FELIPE";
        ano = 2022;
        System.out.println("Meu nome é " + meuNome);
        System.out.println("Meu nome é " + meuNome + "e tenho " + ano + " anos");

        ano = 2023;
        System.out.println("Meu nome é " + meuNome);
        System.out.println("Meu nome é " + meuNome + "e tenho " + ano + " anos");
     }
}

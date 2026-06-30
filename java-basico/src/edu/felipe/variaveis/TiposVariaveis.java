package edu.felipe.variaveis;

import java.util.Scanner;


public class TiposVariaveis {
     public static void main(String [] args){
        int idade;
        int ano;
        String cep;
        String cpf;
        float preco;
        double PI;   
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        idade = sc.nextInt();
        System.out.println("Digite o ano");
        ano = sc.nextInt();
        System.out.println("Digite o cep");
        cep = sc.next();
        System.out.println("Digite o cpf");
        cpf = sc.next();
        System.out.println("Digite o preco");
        preco = sc.nextFloat();
        System.out.println("Digite PI");
        PI = sc.nextDouble();
        
        System.out.println("Idade:"+ idade);
        System.out.println("Ano:"+ ano);
        System.out.println("Cep:"+ cep);
        System.out.println("Cpf:"+ cpf);
        System.out.println("Preco:"+ preco);
        System.out.println("PI:"+ PI);

        sc.close();
   }
}

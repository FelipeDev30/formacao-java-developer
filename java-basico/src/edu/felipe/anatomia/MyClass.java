package edu.felipe.anatomia;

import java.util.Scanner;

public class MyClass {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        String nomeCompleto = nomeCompleto(nome, sobrenome);
        System.out.println("O nome completo é: " + nomeCompleto);
        scan.close();
    }

    public static String nomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}

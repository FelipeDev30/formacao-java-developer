package edu.felipe.exemplo;

import java.util.Locale;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome:");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite a altura:");
        double altura = scanner.nextDouble();

        System.out.println("Ola, me chano " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " anos ");
        System.out.println("Minha altura e: " + altura + "m");

        scanner.close();
    }
}

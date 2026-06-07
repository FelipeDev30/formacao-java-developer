package edu.felipe.operadores;

public class Operadores {
    public static void main(String[] args) {
        /*        
            Operadores Unários
            +           Adição
            -           Subtração
            ++          Incremento
            --          Decremento
            !           Negação
            ~           Inversão lógica
            (int)       Conversão de tipo

            Operadores de Atribuição
            +=          Adição
            -=          Subtração
            *=          Multiplicação
            /=          Divisão
            %=          Módulo / resto

            Operadores Aritiméticos

            =            Operador de atribuição
            +           Adição / concatenação
            -           Subtração
            *           Multiplicação
            /           Divisão
            %           Módulo / resto

            Operadores Relacionais
            ==         Igualdade
            !=         Diferente
            <          Menor que
            >          Maior que
            <=         Menor ou igual que
            >=         Maior ou igual que

            Operadores Lógicos
            &&         E
            ||         OU
            !          NÃO
        */

        double peso = 90.7;
        double altura = 1.60;

        double imc = peso / (altura * altura);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc >= 18.5 && imc < 25){
            System.out.println("Peso normal");
        }else if (imc >= 25 && imc < 30){
            System.out.println("Sobrepeso");
        }else if (imc >= 30 && imc < 35){
            System.out.println("Obesidade grau I");
        }else if (imc >= 35 && imc < 40){
            System.out.println("Obesidade grau II");
        }else{
            System.out.println("Obesidade grau III");
        }

        System.out.println(imc);
    }
}

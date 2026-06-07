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
/* 
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

        System.out.println(imc); */

        int numero = 5;

        numero = numero + 1;
        System.out.println(numero);

        numero++;
        System.out.println(numero);

        --numero;
        System.out.println(numero);
        
        // Operadores de atribuição
        numero += 1;
        System.out.println(numero);

        numero -= 1;
        System.out.println(numero);

        numero *= 1;
        System.out.println(numero);

        numero /= 1;
        System.out.println(numero);

        numero %= 1;
        System.out.println(numero);

        // Operadores relacionais
        boolean maiorDeIdade = numero >= 18;
        System.out.println(maiorDeIdade);

        // Operadores lógicos
        boolean maiorDeIdade1 = numero >= 18;
        boolean temCNH = numero >= 18;
        boolean podeDirigir = maiorDeIdade1 && temCNH;
        System.out.println(podeDirigir);

        boolean podeDirigir1 = maiorDeIdade1 || temCNH;
        System.out.println(podeDirigir1);

        boolean podeDirigir2 = !maiorDeIdade1;
        System.out.println(podeDirigir2);

        // Operadores ternários
        String resultado = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);

        String resultado1 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado1);

        String resultado2 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado2);

        String resultado3 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado3);

        String resultado4 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado4);

        String resultado5 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado5);

        String resultado6 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado6);

        String resultado7 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado7);

        String resultado8 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado8);

        String resultado9 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado9);

        String resultado10 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado10);

        String resultado11 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado11);

        String resultado12 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado12);

        String resultado13 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado13);

        String resultado14 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado14);

        String resultado15 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado15);

        String resultado16 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado16);

        String resultado17 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado17);

        String resultado18 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado18);

        String resultado19 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado19);

        String resultado20 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado20);

        String resultado21 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado21);

        String resultado22 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado22);

        String resultado23 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado23);

        String resultado24 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado24);

        String resultado25 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado25);

        String resultado26 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado26);

        String resultado27 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado27);

        String resultado28 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado28);

        String resultado29 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado29);

        String resultado30 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado30);

        String resultado31 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado31);

        String resultado32 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado32);

        String resultado33 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado33);

        String resultado34 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado34);

        String resultado35 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado35);

        String resultado36 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado36);

        String resultado37 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado37);

        String resultado38 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado38);

        String resultado39 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado39);

        String resultado40 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado40);

        String resultado41 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado41);

        String resultado42 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado42);

        String resultado43 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado43);

        String resultado44 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado44);

        String resultado45 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado45);

        String resultado46 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado46);

        String resultado47 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado47);

        String resultado48 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado48);

        String resultado49 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado49);

        String resultado50 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado50);

        String resultado51 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado51);

        String resultado52 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado52);

        String resultado53 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado53);

        String resultado54 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado54);

        String resultado55 = maiorDeIdade1 ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado55);
    }
}

package edu.felipe.escopo;

public class Conta {

    double saldo = 10.0;
    double novoSaldo = 0;

    public void sacar(Double valor) {
        novoSaldo = saldo - valor;
        saldo = novoSaldo;
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + saldo);
    }

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.imprimirSaldo();
        conta.sacar(2.0);
        conta.imprimirSaldoAtual();
        System.out.println("Divida Exponencial: " + conta.calcularDividaExponencial());
    }

    public void imprimirSaldoAtual() {
        System.out.println("Novo saldo: " + novoSaldo);
    }

    public double calcularDividaExponencial() {
        double valorParcela = 50.0;
        double valorMontante = 0.0;
        for (int x = 1; x <= 5; x++) {
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }
        return valorMontante;
    }
}

package edu.felipe.smarttv;

import java.util.Scanner;

public class SmartTv {

    Scanner scan = new Scanner(System.in);

    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
        System.out.println("TV ligada");
    }

    public void desligar() {
        ligada = false;
        System.out.println("TV desligada");
    }

    public void aumentarVolume() {
        volume++;
        if (volume > 0 && volume < 100) {
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("Volume inválido");
        }
    }

    public void diminuirVolume() {
        volume--;
        if (volume > 0 && volume < 100) {
            System.out.println("Volume atual: " + volume);
        } else {
            System.out.println("Volume inválido");
        }
    }

    public void aumentarCanal() {
        canal++;
        if (canal > 0 && canal < 100) {
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void diminuirCanal() {
        canal--;
        if (canal > 0 && canal < 100) {
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void mudarCanal() {
        int novoCanal = scan.nextInt();
        if (novoCanal > 0 && novoCanal < 100) {
            canal = novoCanal;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Canal inválido");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (novoCanal > 0 && novoCanal < 100) {
            canal = novoCanal;
            System.out.println("Canal atual: " + canal);
        } else {
            System.out.println("Canal inválido");
        }
    }
}

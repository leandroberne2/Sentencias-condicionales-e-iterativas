package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = myScanner.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = myScanner.nextInt();
        if (num1 > num2) {
            System.out.println("El primer número: " + num1 + " es el mayor");
        } else if (num2 > num1) {
            System.out.println("El segundo número: " + num2 + " es el mayor");
        } else {
            System.out.println("Ambos números son iguales");
        }
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número y te diré si es Primo o no");
        int num = sc.nextInt();
        if (esPrimo(num)) {
            System.out.println("El número " + num + " SI es primo");
        } else {
            System.out.println("El número " + num + " NO es primo");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }
}
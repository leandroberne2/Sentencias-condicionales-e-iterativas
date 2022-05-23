package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del cursante");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la primera nota de " + nombre);
        int nota1 = sc.nextInt();
        System.out.println("Ingresa la segunda nota de " + nombre);
        int nota2 = sc.nextInt();
        System.out.println("Ingresa la tercera nota de " + nombre);
        int nota3 = sc.nextInt();
        int promedio = (nota1 + nota2 + nota3) / 3;
        String estado;
        if (promedio < 6) {
            estado = "desaprobado";
        } else if (promedio < 9) {
            estado = "aprobado";
        } else {
            estado = "promocionado";
        }
        System.out.println("El/La cursante " + nombre + " tiene un promedio de " + promedio + " y su estado es " + estado);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto:");
        String nombreProd = sc.nextLine();
        System.out.println("Ingrese el precio del producto:");
        int precioProd = sc.nextInt();
        System.out.println("Ingrese el metodo de pago (1 - 2 - 3)");
        int metodoPago = sc.nextInt();
        if (metodoPago == 1) {
            int descuento = (precioProd * 15) / 100;
            System.out.println("Al contado el precio del producto " + nombreProd + " es de $" + (precioProd - descuento));
        } else if (metodoPago == 2) {
            System.out.println("Con debito el precio del producto " + nombreProd + " es de $" + precioProd);
        } else {
            int recargo = (precioProd * 10) / 100;
            System.out.println("Con credito el precio del producto " + nombreProd + " es de $" + (precioProd + recargo));
        }
    }
}
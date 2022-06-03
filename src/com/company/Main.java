package com.company;

public class Main {

    public static void main(String[] args) {
        int[] fila1 = {1, 2, 0};
        int[] fila2 = {3, 1, 4};
        int[] fila3 = {3, 0, 1};
        int[][] filas = {fila1, fila2, fila3};

        /* Ejercicio a */
        int sumatoria = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumatoria += filas[i][j];
            }
        }
        System.out.println("a. " + sumatoria);

        /* Ejercicio b */
        int producto = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                producto *= filas[i][j];
            }
        }
        System.out.println("b. " + producto);

        /* Ejercicio c */
        int sumDiagPrincipal = 0;
        for (int i = 0; i < 3; i++) {
            sumDiagPrincipal += filas[i][i];
        }
        System.out.println("c. " + sumDiagPrincipal);

        /* Ejercicio d */
        int prodDiagPrincipal = 1;
        for (int i = 0; i < 3; i++) {
            prodDiagPrincipal *= filas[i][i];
        }
        System.out.println("d. " + prodDiagPrincipal);

        /* Ejercicio e */
        int sumDiagSecundaria = 0;
        for (int i = 0; i < 3; i++) {
            sumDiagSecundaria += filas[i][2 - i];
        }
        System.out.println("e. " + sumDiagSecundaria);

        /* Ejercicio f */
        int prodDiagSecundaria = 1;
        for (int i = 0; i < 3; i++) {
            prodDiagSecundaria *= filas[i][2 - i];
        }
        System.out.println("f. " + prodDiagSecundaria);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 7; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 1; j <= 7; j++) {
            for(int i = 1; i <= 7 - j; i++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= j; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int j = 7; j >= 1; j--) {
            for(int i = 1; i <= 8 - j; i++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= j - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
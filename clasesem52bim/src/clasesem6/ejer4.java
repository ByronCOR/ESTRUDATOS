/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem6;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS");
        int filas = entrada.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS");
        int columnas = entrada.nextInt();
        if (filas == columnas) {
            int[][] arregloA = new int[filas][columnas];
            int[][] arregloB;

            arregloA = datosArregloA(arregloA);
            arregloB = cambiar(arregloA);
            String cadena1 = "";
            String cadena2 = "";
            for (int f = 0; f < arregloB.length; f++) {

                for (int c = 0; c < arregloB[f].length; c++) {
                    cadena1 = String.format("%s %s ", cadena1, arregloA[f][c]);
                    cadena2 = String.format("%s %s ", cadena2, arregloB[f][c]);
                }
                cadena1 = String.format("%s\n", cadena1);
                cadena2 = String.format("%s\n", cadena2);
            }
            System.out.printf("%s\n", cadena1);
            System.out.printf("%s\n", cadena2);
        }
    }

    public static int[][] datosArregloA(int[][] a) {
        Scanner entrada = new Scanner(System.in);
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                System.out.printf("INGRESE UN NUMERO DE LA FILA %d\n", f + 1);
                a[f][c] = entrada.nextInt();
            }
        }
        return a;
    }

    public static int[][] cambiar(int[][] a) {
        int[][] b = new int[a.length][a.length];
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                b[c][f] = a[f][c];
            }
        }
        return b;
    }

}

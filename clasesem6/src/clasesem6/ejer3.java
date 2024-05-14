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
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS");
        int filas = entrada.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS");
        int columnas = entrada.nextInt();
        String cadena1 = "";
        String cadena2 = "";
        String cadena3 = "";
        int[][] arregloA = new int[filas][columnas];
        int[][] arregloB = new int[filas][columnas];
        int[][] arregloC = new int[filas][columnas];
        arregloA = datosArregloA(arregloA);
        arregloB = datosArregloB(arregloB);
        arregloC = sumaArreglo(arregloA, arregloB, arregloC);

        for (int f = 0; f < arregloC.length; f++) {

            for (int c = 0; c < arregloC[f].length; c++) {
                cadena1 = String.format("%s %s ", cadena1, arregloA[f][c]);
                cadena2 = String.format("%s %s ", cadena2, arregloB[f][c]);
                cadena3 = String.format("%s %s ", cadena3, arregloC[f][c]);
            }
            cadena1 = String.format("%s\n", cadena1);
            cadena2 = String.format("%s\n", cadena2);
            cadena3 = String.format("%s\n", cadena3);

        }
        System.out.printf("\n%s\n", cadena1);
        System.out.printf("%s\n", cadena2);
        System.out.printf("%s\n", cadena3);
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

    public static int[][] datosArregloB(int[][] b) {
        Scanner entrada = new Scanner(System.in);
        for (int f = 0; f < b.length; f++) {
            for (int c = 0; c < b[f].length; c++) {
                System.out.printf("INGRESE UN NUMERO DE LA FILA %d\n", f + 1);
                b[f][c] = entrada.nextInt();
            }
        }
        return b;
    }

    public static int[][] sumaArreglo(int[][] a, int[][] b, int[][] d) {
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                int suma = a[f][c] + b[f][c];
                d[f][c] = suma;
            }
        }
        return d;
    }

}

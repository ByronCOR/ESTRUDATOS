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
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS");
        int filas = entrada.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS");
        int columnas = entrada.nextInt();

        int[][] arregloA = new int[filas][columnas];
        int[][] arregloB;
        int[] arregloSuma;

        arregloA = datosArreglo(arregloA);

        arregloB = ordenarMatriz(arregloA);

        arregloSuma = sumaColumna(arregloB);
        ordenarColumna(arregloB);

    }

    public static int[][] datosArreglo(int[][] a) {
        Scanner entrada = new Scanner(System.in);
        String cadena = "";
        for (int f = 0; f < a.length; f++) {
            System.out.printf("numero de la fila %d\n", f + 1);
            for (int c = 0; c < a[f].length; c++) {
                a[f][c] = entrada.nextInt();
                cadena = String.format("%s %s ", cadena, a[f][c]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
        return a;
    }

    public static int[][] ordenarMatriz(int[][] a) {
        String cadena = "";
        for (int f = 0; f < a.length; f++) {
            for (int i = a[f].length; i >= 0; i--) {
                for (int j = a[f].length - 1; j > 0; j--) {
                    if (a[f][j] > a[f][j - 1]) {
                        int aux = a[f][j];
                        a[f][j] = a[f][j - 1];
                        a[f][j - 1] = aux;
                    }
                }
            }
        }
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a.length; c++) {
                cadena = String.format("%s %s ", cadena, a[f][c]);
            }
            cadena = String.format("%s\n", cadena);
        }
        System.out.println(cadena);
        return a;
    }

    public static int[] sumaColumna(int[][] b) {
        String cadena = "";
        int[] sc = new int[b.length];
        for (int c = 0; c < b.length; c++) {
            int suma = 0;
            for (int f = 0; f < b[c].length; f++) {
                suma = suma + b[f][c];
            }
            sc[c] = suma;
            cadena = String.format("%s %s ", cadena, sc[c]);
        }
        System.out.println(cadena);
        return sc;
    }

    public static void ordenarColumna(int[][] b) {
        String cadena = "";

        for (int f = 0; f < b.length; f++) {
            cadena = String.format("%s %s ", cadena, b[f][0]);
        }
        System.out.println(cadena);
    }
}

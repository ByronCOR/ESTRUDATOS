/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO DE FILAS");
        int filas = entrada.nextInt();
        System.out.println("INGRESE EL NUMERO DE COLUMNAS");
        int columnas = entrada.nextInt();
        int[][] arreglo1 = new int[filas][columnas];
        arreglo1 = datosArreglo(arreglo1);
        
        for (int f = 0; f < arreglo1.length; f++) {
            String cadena = "";
            for (int c = 0; c < arreglo1[f].length; c++) {
                cadena = String.format("%s %s ", cadena, arreglo1[f][c]);
            }
            System.out.printf("%s\n", cadena);
        }

    }

    public static int[][] datosArreglo(int[][] a) {
        Scanner entrada = new Scanner(System.in);
        for (int f = 0; f < a.length; f++) {
            for (int c = 0; c < a[f].length; c++) {
                System.out.printf("INGRESE UN NUMERO DE LA FILA %d\n", f + 1);
                a[f][c] = entrada.nextInt();
            }
        }
        return a;
    }

}

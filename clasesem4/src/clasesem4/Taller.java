/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem4;

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
        int[] arreglo1 = {7, 14, 1, 7, 2};
        int[] arreglo2;

        System.out.println("Indique el numero por el que qruiere remplazar");
        int num = entrada.nextInt();
        System.out.println("Indique el subidice del elemento a cambiar\n 0, 1, 2, 3, 4");
        int indice = entrada.nextInt();

        arreglo2 = insertar(arreglo1, num, indice);
        presentarDatos(arreglo2);

    }

    public static int[] insertar(int[] a, int n, int si) {
        int aux;

        int[] arreglo;
        for (int i = a.length; i > si; i--) {
            if (si == i) {
                a[i] = n;
            }
            aux = a[i - 1];
            a[i] = aux;

        }

        arreglo = a;
        return arreglo;
    }

    public static void presentarDatos(int[] array) {
        String acumulador = "";
        for (int i = 0; i < array.length; i++) {
            acumulador = String.format("%s %s", acumulador, array[i]);
        }
        System.out.println(acumulador);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem4;

/**
 *
 * @author utpl
 */
public class Ordenar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] arreglo1 = {9, 14, 1, 7, 2};
        int[] arreglo3;

        arreglo3 = burbuja(arreglo1);
        presentarDatos(arreglo3);

    }

    public static int[] burbuja(int[] arreglo) {
        int aux;
        int[] arreglo2;
        for (int i = 1; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo.length - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;

                }
            }

        }
        arreglo2 = arreglo;
        return arreglo2;
    }

    public static void presentarDatos(int[] array) {
        String acumulador = "";
        for (int i = 0; i < array.length; i++) {
            acumulador = String.format("%s %s", acumulador, array[i]);
        }
        System.out.println(acumulador);
    }
}

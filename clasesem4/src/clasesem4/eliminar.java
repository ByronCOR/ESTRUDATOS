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
public class Eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] arreglo2 = {3, 7, 2, 9, 8};
        System.out.println("Ingrese a eliminar");
        int numEliminar = entrada.nextInt();
        int dato = buscar(arreglo2, numEliminar);
        if (dato == -1) {
            System.out.println("El numero no fue encrontrado ");
        } else {
            eliminar(arreglo2, dato);

        }
    }

    public static int buscar(int[] num, int dato) {
        int indice = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == dato) {
                indice = i;
            }
        }
        return indice;
    }

    public static void eliminar(int[] num, int dato) {
        String acumulador = "";
        num[dato] = 0;
        System.out.println("El numero que fue encontrado en "
                + "la posicion[" + dato + "] del arreglo fue eliminado");
        for (int i = 0; i < num.length; i++) {
            acumulador = String.format("%s %s",acumulador, num[i]);
        }
        System.out.println(acumulador);
    }

}


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
public class eliminar {

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
            System.out.println("El numero fue encontrado en "
                    + "la posicion[" + dato + "]del arreglo");
        }
    }

    public static int buscar(int[] num, int dato) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == dato) {
                return i;
            }
            return buscar
        }
        return 2;
    }

    public static void eliminar(int[] num, int dato) {
        if (dato != -1) {

            for (int i = dato; i < num.length; i++) {
                {
                    num[i] = num[i + 1];

                }
                num[i] = 0;
            }
        }
    }
}

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
public class Clasesem4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo1;
        arreglo1 = ingresarDatos();
        presentarDatos(arreglo1);

    }

    public static int[] ingresarDatos() {
        Scanner entrada = new Scanner(System.in);
int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Dato[" + i + "]:");
            array[i] = entrada.nextInt();
        }
        return array;
    }
        public static void presentarDatos(int[] array) {        
        for (int i = 0; i < array.length; i++) {
            System.out.println(" "+array[i] +" ");
        }
    }

}

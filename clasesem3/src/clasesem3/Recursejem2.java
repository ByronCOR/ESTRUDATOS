/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesem3;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Recursejem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int resultado = Obtenersuma(5, 10);
        System.out.println(resultado);
    }
    public static int Obtenersuma(int n1, int n2) {
        if (n1 > n2) {
            return 0;
        } else {
            return n1 + Obtenersuma(n1+1, n2);
        }
    }
}

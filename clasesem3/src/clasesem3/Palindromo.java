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
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra ="sometemos";
        boolean resultado = CompararPalabra(palabra.toLowerCase());
        System.out.println(resultado);
    }

    public static boolean CompararPalabra(String f) {
        if (f.length() == 0 || f.length() == 1) {
            return true;
        }
        if (f.charAt(0) == f.charAt(f.length() - 1)) {
            return CompararPalabra(f.substring(1, f.length() - 1));
        }
        return false;
    }

}

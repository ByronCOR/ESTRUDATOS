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
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la base");
        int b = entrada.nextInt();
        System.out.println("Ingrese el exponente");
        int e = entrada.nextInt();
        int resultado = Obtenerpotencia(b, e);
        System.out.println(resultado);
        int resultado2 = Obtenerpotenciar(b, e);
        System.out.println(resultado2);
    }

    public static int Obtenerpotencia(int b, int e) {
        int multi = 1;
        while (e >= 1) {
            multi = multi * b;
            e--;
        }
        return multi;
    }

    public static int Obtenerpotenciar(int b, int e) {
        if (e == 0) {
            return 1;
        } else {
            return b * Obtenerpotenciar(b, e - 1);
        }
    }
}

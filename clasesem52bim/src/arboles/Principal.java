/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

import java.util.Scanner;
import arboles.Arbol;

/**
 *
 * @author utpl
 */
public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean bandera = true;
        Arbol a = new Arbol();
        while (bandera) {
                    System.out.println(""
                + "1:Ingresar los cargos\n"
                + "2:Buscar cargo\n"
                + "3: Mostrar\n");
        int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.println("CARGOS\n"
                        + "1:Gerencia\n"
                        + "2:Coordinador\n"
                        + "3: Asistente\n");
                int num = entrada.nextInt();
                String cargo;

                int contador = 1;

                if (num == 1 && contador < 2) {
                    cargo = "Gerencia";
                    a.insertar(10, cargo);
                    contador++;
                } else {

                }
                if (num == 2 && contador > 1 && contador < 4) {
                    cargo = "Cordinador\nZona ";
                    if (contador == 2) {
                        a.insertar(8, cargo + "1");
                    } else {
                        if (contador == 3) {
                            a.insertar(13, cargo + "2");
                        }
                    }
                    contador++;
                } 

                if (num == 3 && contador > 3 && contador < 8) {
                    cargo = "Asistente ";
                    if (contador == 4) {
                        a.insertar(6, cargo + "1");
                    } else {
                        if (contador == 5) {
                            a.insertar(9, cargo);
                        } else {
                            if (contador == 6) {
                                a.insertar(12, cargo);
                            } else {
                                if (contador == 7) {
                                    a.insertar(14, cargo);
                                }
                            }
                        }
                    }
                    contador++;
                } else {
                    System.out.println("ya no pueden tener mas Asitentes");
                }

            } else {
                if (opcion == 2) {
                    System.out.println(""
                            + "10:Gerente\n"
                            + "8 :Coordinador Zona 1"
                            + "13:Coordinador Zona 2"
                            + "6 :Asistente 1"
                            + "9 :Asistente 2"
                            + "12:Asistente 3"
                            + "14:Asistente 4");
                    int cod = entrada.nextInt();
                    if (a.buscar(cod)) {
                        System.out.println("cargo encontradp");
                    } else {
                        System.out.println("cargo no encontrado");
                    }

                } else {
                    if (opcion == 3) {
                        a.recorridoEnOrden(null);
                    }
                }
            }
        }
    }
}

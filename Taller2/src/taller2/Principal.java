/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;


/* En un arreglo unidimensional de tamaño N se puede almacenar las cédulas de los clientes
que van llegando al registro civil. Los usuarios son atendidos en orden de llegada, es decir
siempre el cliente del índice 0 del arreglo será atendido primero. Cuando el primer cliente ya
fue atendido, todas las cédulas deben correr hacia la izquierda para nuevamente atender al
nuevo cliente del índice 0. Considerar ubicar mensajes que indiquen que no hay clientes que
atender o que el cliente ya fue atendido. En caso de que un cliente de otro índice se retire
también deben correr los clientes que estaban a la derecha. Por tanto, entre las opciones o
mensajes para manejar el arreglo debe existir: ingresar nuevo cliente, atender cliente,
retirarse de la cola.

 */
public class Principal {

    public static void main(String[] args) {
        Cola lista = new Cola();
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Digite\n"
                    + "Ingresar nuevo cliente = 1\n"
                    + "Atender cliente = 2\n"
                    + "Retirarse de la cola = 3\n"
                    + "Ver los clientes por atender = 4\n");

            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 1) {
                System.out.print("Ingrese la cédula del nuevo cliente: ");
                String cedula = entrada.nextLine();
                lista.insertarNodo(lista, cedula);
                System.out.println("Cliente ingresado correctamente.");

            } else {
                if (opcion == 2) {
                    lista.atenderCliente(lista);
                } else {
                    if (opcion == 3) {

                        System.out.print("Ingrese la cédula del cliente que se retira: ");
                        String cedula = entrada.nextLine();

                        lista.eliminarNodo(lista, cedula);
                    } else {
                        if (opcion == 4) {
                            lista.verLista();
                        }
                    }
                }

            }
        }
    }
 private int encontrarCargo(Nodo raiz) {
        return raiz.izquierda == null ? raiz.cargo : encontrarCargo(raiz.izquierda);
    }

    public void buscar(int cargo) {
        raiz = buscarRecursivo(raiz, cargo);
    }

    private Nodo buscarRecursivo(Nodo current,String cargo) {
        if (current == null) {
            return null;
        }

        if (valor == current.valor) {

            if (current.izquierda == null && current.derecha == null) {
                return ;
            }
            if (current.derecha == null) {
                return current.izquierda;
            }
            if (current.izquierda == null) {
                return current.derecha;
            }

            int encoCargo = encontrarCargo(current.derecha);
            current.valor = smallestValue;
            current.derecha = deleteRecursive(current.derecha, smallestValue);
            return current;
        }

        if (valor < current.valor) {
            current.izquierda = deleteRecursive(current.izquierda, valor);
            return current;
        }

        current.derecha = deleteRecursive(current.derecha, valor);
        return current;

    }

}

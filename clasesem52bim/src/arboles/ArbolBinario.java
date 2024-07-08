/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;

/**
 *
 * @author utpl
 */
public class ArbolBinario {

    Nodo raiz= null;
    public void insertar(int valor){
    raiz = insertarRecusividad(raiz,valor);
    }

    private Nodo insertarRecusividad(Nodo current, int valor) {
        if (current == null) {
            return new Nodo(valor);
        }
        if (valor < current.valor) {
            current.izquierda = insertarRecusividad(current.izquierda, valor);
        } else if (valor > current.valor) {
            current.derecha = insertarRecusividad(current.derecha, valor);
        } else {
            return current;
        }
        return current;
    }

    private int findSmallestValue(Nodo raiz) {
        return raiz.izquierda == null ? raiz.valor : findSmallestValue(raiz.izquierda);
    }

    public void delete(int valor) {
        raiz = deleteRecursive(raiz, valor);
    }

    private Nodo deleteRecursive(Nodo current, int valor) {
        if (current == null) {
            return null;
        }

        if (valor == current.valor) {

            if (current.izquierda == null && current.derecha == null) {
                return null;
            }
            if (current.derecha == null) {
                return current.izquierda;
            }
            if (current.izquierda == null) {
                return current.derecha;
            }

            int smallestValue = findSmallestValue(current.derecha);
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

    public void recorridoPreOrden(Nodo nd) {
        if (nd != null) {
            System.out.println("" + nd.valor);
            recorridoPreOrden(nd.izquierda);
            recorridoPreOrden(nd.derecha);
        }
    }

    public void recorridoEnOrden(Nodo nd) {
        if (nd != null) {

            recorridoEnOrden(nd.izquierda);
            System.out.println("" + nd.valor);
            recorridoEnOrden(nd.derecha);
        }
    }

    public void recorridoPostOrden(Nodo nd) {
        if (nd != null) {
            recorridoPostOrden(nd.izquierda);
            recorridoPostOrden(nd.derecha);
            System.out.println("" + nd.valor);
        }
    }

}

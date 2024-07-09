/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;




/**
 *
 * @author utpl
 */
public class Arbol {
    Nodo raiz= null;
  public void insertar(int clave, String cargo) {
        raiz = insertarRecusividad(raiz, clave, cargo);
    }

    public Nodo insertarRecusividad(Nodo raiz, int cod, String cargo) {
        if (raiz == null) {
            raiz = new Nodo(cod, cargo);
            return raiz;
        }
        if (cod < raiz.cod) {
            raiz.izquierda = insertarRecusividad(raiz.izquierda, cod, cargo);
        } else if (cod > raiz.cod) {
            raiz.derecha = insertarRecusividad(raiz.derecha, cod, cargo);
        }
        return raiz;
    }
    public boolean buscar(int cod){
    return buscarRecusividad(raiz,cod);
    }
    public boolean buscarRecusividad(Nodo raiz, int cod) {
        if(raiz == null){
            return false;
        }
        if (raiz.cod == cod){
        return true;
        }
        if(cod < raiz.cod){
        return buscarRecusividad(raiz.izquierda,cod);
        }
        return buscarRecusividad(raiz.derecha,cod);
    }
    
      public void recorridoEnOrden(Nodo raiz) {
        if (raiz != null) {
            recorridoEnOrden(raiz.izquierda);
            System.out.println(raiz.cargo);
            recorridoEnOrden(raiz.derecha);
        }
    }
}





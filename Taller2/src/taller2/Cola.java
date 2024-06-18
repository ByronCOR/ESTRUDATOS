/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

/**
 *
 * @author Usuario
 */
public class Cola {

    private Nodo cabeza;
    private Nodo cola;
    

    public void ListaSimple() {
        cabeza = null;
        cola = null;
        
    }
    
     public Cola insertarNodo(Cola lista, String c){
        // Crear un nuevo nodo
        Nodo nuevo = new Nodo(c);
       //new_node.next = null;
 
       // Para el caso que la lista esté vacia
        if (lista.cabeza == null) {
            lista.cabeza = nuevo;
            lista.cola= nuevo;
        }
        else {
            // Para ir al final de la lista
          
            while (cola.siguiente != null) {
                cola = cola.siguiente;
            }
 
            // Insertar al final de la lista
            cola.siguiente = nuevo;
        }
 
        return lista;
    }

    public  Cola atenderCliente(Cola lista){
 
        Nodo nuevo = lista.cabeza;
 
 
        if (nuevo != null) {
            lista.cabeza = nuevo.siguiente; 

            System.out.println("\n\nCliente antendido exitosamente\n");

            return lista;
        }
        if(nuevo == null){
             System.out.println("No hay clientes que atender.");
        }

       
        return lista;
    }
     public  Cola eliminarNodo(Cola lista,String ced){
 
        Nodo nuevo = lista.cabeza, prev = null;
 
 
        if (nuevo != null && nuevo.cedula.equalsIgnoreCase(ced)) {
            lista.cabeza = nuevo.siguiente; 

            System.out.println(ced + " found and deleted");

            return lista;
        }

        while (nuevo != null && !nuevo.cedula.equalsIgnoreCase(ced)) {
            prev = nuevo;
            nuevo = nuevo.siguiente;
        }
 
 
        if (nuevo != null) {

  
            prev.siguiente = nuevo.siguiente;

            System.out.println(ced + "cliente encontrado se ha retirado");
        }
 
  
        if (nuevo == null) {
            System.out.println(ced + " cliente no encontrado");
        }

        return lista;
    }


  

    public void verLista() {
        
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.printf("\nCedula:%s\n",
                    actual.cedula);
 
            actual = actual.siguiente;
        }
    
        System.out.println("\n");
    }
}
   
    // Método para mostrar todos los nodos de la lista



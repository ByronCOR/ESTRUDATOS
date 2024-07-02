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


private void insertar(int valor){
    Nodo root= null;
raiz= insertarArbol(raiz,valor);
}


private int findSmallestValue(Node root){
return root.left === null ? root.values: find SmallestValue(root.left);
}
public void delete(int value){
root= deleteRecursive(root,valor);
}


private Nodo deleteRecursive (Nodo current,int valor){
            if (current==null) {
                return null;               
            }
            
             if (valor==current.valor) {
                 
                  if (current.izquierda ==null && current.derecha==null) {
                return null;             
            }
                     if (current.derecha==null) {
                return current.izquierda ;             
            }
                          if (current.izquierda==null) {
                return current.derecha;             
            }
                          
                          int smallestValue= findSmallestValue(current.derecha);
                          current.valor=smallestValue;
                          current.derecha=deleteRecursive(current.derecha,smallestValue);
                          return current;
            }
                
             if (valor<current.valor) {
                 current.izquierda= deleteRecursive(current.izquierda,valor);
                 return current;        
    }
                    
                 current.derecha= deleteRecursive(current.derecha,valor);
                 return current;        
    
             
            
}
}

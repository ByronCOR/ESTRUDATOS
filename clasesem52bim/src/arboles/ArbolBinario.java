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
raiz= insertarArbol(raiz,valor);
}


private int findSmallestValue(Node root){
return root.left === null ? root.values: find SmallestValue(root.left);
}
public void delete(int value){
root= deleteRecursive(root,value);
}


private Node deleteRecursive (Node current,int value){
            if (current==null) {
                return null;               
            }
            
             if (value==current.value) {
                 
                  if (current.left==null && current.rigth==null) {
                return null;             
            }
                     if (current.rigth==null) {
                return current.left ;             
            }
                          if (current.left==null) {
                return current.rigth;             
            }
                          
                          int smallestValue= findSmallestValue(current.rigth);
                          current.value=smallestValue;
                          current.rigth=deleteRecursive(current.rigth,smallestValue);
                          return current;
            }
             if (value<corrent.value) {
                 current.left= deleteRecursive(current.left,value)
        
    }
            
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arboles;



/**
 *
 * @author utpl
 */
public class Nodo {
    String cargo; 
    int cod;
    Nodo izquierda;
    Nodo derecha;
    
    public Nodo(int va,String c){
    cod = va;
    cargo = c;
    izquierda = null;
    derecha = null;
    
    }

}




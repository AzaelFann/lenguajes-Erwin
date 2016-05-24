/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Azael Fann Heian
 * en una clase puede haber muchos constructores
 * siempre y cuando sean distintos
 */
public class Animal {
    String nombre;
    String especie;
    boolean carnivoro;
    
    // hacer tres constructores mas
    
    public Animal(String valor){
        nombre=valor;
    }
     public Animal(String valor1, String valor2){
        especie = valor1;
        nombre=valor2;
    }
    public Animal(){
        nombre = "Dragon";
    }
}

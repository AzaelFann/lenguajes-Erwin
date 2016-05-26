/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author Azael Fann Heian
 */
public class ProbarConstructores {
    
    public static void main(String[] args) {
        
        Animal obj1 = new Animal();
        System.out.println("El nombre del animal es: "+obj1.nombre);
        System.out.println("La especie del animal es: "+obj1.especie);
        System.out.println("El animal es carnivoro? "+obj1.carnivoro);
    } 
}

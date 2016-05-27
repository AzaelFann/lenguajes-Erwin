/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;


public class ProbarUsuario {
    public static void main(String[] args) {
        /*creamos un objeto con el constructor de defecto 
        de la calse usuario
        en el main no debe existir ninguna asignacion
        (set) mutador
        (get) accesorio
       por cada atributo debe haber un metodo mutador y una accesorio
        */
        Usuarios u1 = new Usuarios();
        u1.setEdad(-5);
       
        System.out.println("Tu edad es: "+u1.getEdad());
    }
}

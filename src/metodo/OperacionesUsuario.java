/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

/**
 *
 * @author Azael Fann Heian
 */
public class OperacionesUsuario {
    
    public String calcularEdadEnDias(Usuarios u){
        int edadDias = u.getEdad()*365;
        return "" + edadDias;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author Azael Fann Heian
 */
public class OperacionesUsuario {
     public String calcularIMC(Usuario u){
        double imc = u.getPeso()*(u.getAltura()*u.getAltura());
        return "" + imc;
    }
}

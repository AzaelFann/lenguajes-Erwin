/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author Azael Fann Heian
 */
public class ProbarGuardado {
    public static void main(String[] args) {
         
        Usuario u = new Usuario("Azael", 22, "azael@gmail.com");
        PersistenciaUsuario p = new PersistenciaUsuario();
        try {
            p.guardar(u);
            System.out.println("Usuario Guardado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

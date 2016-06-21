/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProbarUsuario {
    
    public static void main(String[] args) {
        
     //vamos a leer el Array list a ver que hay
     //paso 1 creamos un objeto de la clase persistenciausuario
     PersistenciaUsuario p = new PersistenciaUsuario();
        try {
            ArrayList<Usuario> usuarios = p.buscarTodos();
            int tam = usuarios.size();
            System.out.println("Usuarios Guardados: "+tam);
            System.out.println(usuarios.get(2).getNombre());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}

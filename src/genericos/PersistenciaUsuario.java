/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;
//persistencias
//guardar

import java.io.*;
import java.util.ArrayList;

//buscar
//actualizar
//borrar

public class PersistenciaUsuario {
    //esta es una clase model de tipo logico, solamente contiene metodos
    //que representan acciones concretas, la sintaxis y estructura de dicho
    //metodo depende de la accion
    
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios = new ArrayList<>();
    }
    
    //primero generamos el metodo que nos guarda un usuario
    public void guardar(Usuario u) throws Exception {
        
        //paso 1 generar el archivo a guardar
      File f = new File("azael.fann");
      if(f.exists()) usuarios = buscarTodos();
        //indicar que se va a guardar
      FileOutputStream fos = new FileOutputStream(f);
        //generar el objeto que nos va ayudar a guardar el arraylist de usuarios
      ObjectOutputStream oos = new ObjectOutputStream(fos);
        //ahora si a guardar el usuario
      usuarios.add(u);
      oos.writeObject(usuarios);
         
       
    }
    
    //empieza el metodo de leer a los usuarios guardados
    
    public ArrayList<Usuario> buscarTodos() throws Exception{
        File f = new File ("azael.fann");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuarios = (ArrayList<Usuario>)ois.readObject();
        return usuarios;
    }
    
}

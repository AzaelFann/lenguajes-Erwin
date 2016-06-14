/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Azael Fann Heian
 */
public class ValidarArchivo {
    
    public static void validarExtension(String extension)throws ArchivoNoTxtException{
        if(!extension.equals("txt")) throw new ArchivoNoTxtException();
    }
    
}

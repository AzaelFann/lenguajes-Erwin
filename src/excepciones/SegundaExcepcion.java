/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author Azael Fann Heian
 * aqui usaremos las excepciones de tipo checked en las que tu te haces cargo de ellas
 * vamos a usar un paquete que no se encuentra por defecto, se tiene que agregarlo como
 * un import
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Azael Fann Heian\\Documents\\intro drakoi.txt");
        try {
            //input es leer
            //output es escribir
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
           //investigar el bloque try catch y contrastarlo contra el throws
        }
    }
}

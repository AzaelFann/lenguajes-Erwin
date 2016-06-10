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
 * 
 * primer regla de las excepciones
 * un bloque try catch tiene una llave de apertura y una llave de cierre y dentro de su cuerpo
 * puede contener uno o mas renglones que la hacen excepciones
 * 
 *segunda regla
 *despues del try inmediatamente sigue el bloque catch, puede haber tantos catch
 *como excepciones que lancen en el try 
 * 
 * tercera regla
 *puede ponerse un solo catch con una referencia a exception y ella se hace cargo 
 *de cualquier numero de excepciones que podrian tenerse en el try
 * 
 * cuarta regla
 * es conveniente cerrar el codigo de excepciones con un bloque catch
 * que tenga una referencia a exception seguido de un finally
 */


import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Azael Fann Heian\\Documents\\introdrakoi.txt");
        try {
            //input es leer
            //output es escribir
            
            int x=2;
            int y=0;
            //int div= x/y;
            
            FileInputStream fis = new FileInputStream(f);
            int ch = 0;
            StringBuilder builder = new StringBuilder();
            
            while(( ch=fis.read() )!=-1)
                    {
                        builder.append((char)ch);
                    }
            System.out.println("Se leyo bien y se encontro esto: "+builder.toString());
            
       
         } catch (FileNotFoundException ex) {
           //investigar el bloque try catch y contrastarlo contra el throws
        } catch (IOException ex) {
            
        } catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            //finally siempre se ejecuta se lance o no excepciones
        }
    }
}

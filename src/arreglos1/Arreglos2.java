/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos1;

/**
 *
 * @author Azael Fann Heian
 */
public class Arreglos2 {
    public static void main(String[] args) {
        /*
        1.= todos los arreglos son tratados como objetos
        */
        
        int arreglo1[] = new int[3];
        arreglo1[0]=34;
        arreglo1[1]=-23;
        arreglo1[2]=180;
        
        for(int i=0; i<arreglo1.length; i++){ //lenght lee la longitud del arreglo
            System.out.println(arreglo1[i]);
        }
       
        //iteraremos el mismo arreglo pero con un ciclo for mejorado
        //enhanced for
        
        for(int x:arreglo1){
            System.out.println(x);
        }
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/*
 @author Azael Fann Heian
  que es una excepcion en java
  es un error en tiempo de ejecucion y hay de dos tipos
  1. checked exception te haces cargo de ellas con codigo
  2. unchecked exception el compilador te ayuda
 */
public class PrimeraExcepcion {
    public static void main(String[] args) {
        float x=4;
        int y=0;
        System.out.println(x/y);
        //excepcion aritmetica solo se daentre enteros
        
        String falsoNumero ="5";
        int numeroReal = 5;
        System.out.println("Esto es antes de la excepcion");
        int suma=Integer.parseInt(falsoNumero)+numeroReal;
        System.out.println("Todo esta bien aqui");
        if(true){
            System.out.println("siempre aparecere");
                }
        System.out.println("la ejecucion siempre asa aqui se ejecute o no el if");
    }
}

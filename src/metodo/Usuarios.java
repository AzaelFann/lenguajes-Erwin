/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodo;

public class Usuarios {
   private int edad;

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
          if(edad<0){
            edad=0;
            System.out.println("No debes poner edades menor a cero");
        }
        this.edad = edad;
    }
   

    
}

/*
clases se dividen en 3 grandes gruos
****Entidad
-son el reflejo de una tabla
-no tienen logica transaccional
-el encapsulamiento solo se aplica a esta
****Logicas
-solo contienen logica transaccional
 entre una o mas entidades
****Aplicacion(una por proyecto)
-se invocan y crean entidades y se manipulan
 por medio de metodos
-NO TIENEN LOGICA DE NINGUN TIPO
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

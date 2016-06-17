/*
PROBLEMA
GENERAR UN SISTEMA QUE TE PERMITA PERSISITR (GUARDAR) ENTIDADES DE TIPO USUARIO
USANDO SOLAMENTE JAVA 
NOTA: NO USAR ARCHIVOS DE TEXTOO, NI WORD, NI NINGUNA DE ESAS COSAS RARAS,
DEBES USAR TU PROPIA TECNOLOGIA

 */
package genericos;
//Encapsulamiento: atributos privados y metodos get y set por cada atributo

import java.io.Serializable;


public class Usuario implements Serializable{
    private String nombre;
    private Integer edad;
    private String email;
    
    //agregar default constructor y constructor que inicializa los atributos
    public Usuario(String nombre, Integer edad, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", email=" + email + '}';
    }

    public Usuario() {
    }

    
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public Integer getEdad() {
        return edad;
    }

    
    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

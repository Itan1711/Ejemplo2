/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_progra2.Persona;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Adrian
 */
public class Persona {
      private int id;
    private String nombre;
    private String apellido;
    private char genero;
    private int edad;
    private String telefono;
    private String email;
    private String direccionFisica;
    private Date date = new Date();

    public int GetId() {
        return id;
    }

    public void SetId(int id) {
        this.id = id;
    }

    public String GetNombre() {
        return nombre;
    }

    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String GetApellido() {
        return apellido;
    }

    public void SetApellido(String apellido) {
        this.apellido = apellido;
    }

    public char GetGenero() {
        return genero;
    }

    public void SetGenero(char genero) {
        this.genero = genero;
    }

    public int GetEdad() {
        return edad;
    }

    public void SetEdad(int edad) {
        this.edad = edad;
    }

    public String GetTelefono() {
        return telefono;
    }

    public void SetTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String GetEmail() {
        return email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public String GetDireccionFisica() {
        return direccionFisica;
    }

    public void SetDireccionFisica(String direccionFisica) {
        this.direccionFisica = direccionFisica;
    }

    public Date GetDate() {
        return date;
    }

    public void SetDate(Date date) {
        this.date = date;
    }
    
    
    
    public String Hablar(){
        return "Hablando...";
    }
    
    public String Caminar(){
        return "Caminando...";
    }
    
}



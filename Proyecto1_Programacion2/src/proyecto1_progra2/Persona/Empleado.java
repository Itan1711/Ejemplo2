/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_progra2.Persona;
import java.util.Date;

/**
 *
 * @author Adrian
 */
public class Empleado extends Persona {
     private String licencia;
    
    Date date = new Date();

    public String GetLicencia() {
        return licencia;
    }

    public void SetLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    public String AtenderCliente(){
        return "El taxista esta atendiendo....";
    }
    
    public String CobrarTarifa(){
        return "El Taxista esta cobrando la tarifa";
    }
}

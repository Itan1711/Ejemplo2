/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_progra2.Medio_Transporte;

/**
 *
 * @author Adrian
 */
public class Transporte_Terrestre {
      private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String Tipo_Transporte_Terrestre(String tipo){
        return "El tipo de transporte a utilizar sería: " + tipo;
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_progra2.Medio_Transporte;
import java.util.Random;
/**
 *
 * @author Adrian
 */
public class Taxi extends Automovil {
      private String placa;
    private Boolean gps;
    private Boolean rampa_discapacitados;
   
    public Taxi(){}
    
    public Taxi (String placa, boolean gps, boolean rampa, int cantPasajeros, int numPuertas,String tipo ) {
        this.placa = placa;
        this.gps = gps;
        this.rampa_discapacitados = rampa;
        this.setCantidad_pasajeros(cantPasajeros);
        this.setNumero_puertas(numPuertas);
        this.Tipo_Transporte_Terrestre(tipo);
    }
    
    
    public String getPlaca() {
        return "La placa del taxi es: " + "UAM - " + placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public Boolean getRampa_discapacitados() {
        return rampa_discapacitados;
    }

    public void setRampa_discapacitados(Boolean rampa_discapacitados) {
        this.rampa_discapacitados = rampa_discapacitados;
    }
    
    public String Establecer_Placa(){
    int random_placa = 1 + (int)(Math.random() * (1001 - 1));//Queremos valores entre 1 y 1000 generados al azar
        String numS = String.valueOf(random_placa); //De esta manera convertimos el integer en un string
        this.placa = numS;
        return numS;
    }
    
    
            
    
}


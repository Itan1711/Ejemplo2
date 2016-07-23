/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_programacion2;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JOptionPane;
import proyecto1_progra2.Medio_Transporte.*;
import proyecto1_progra2.Persona.Cliente;
import proyecto1_progra2.Persona.Persona;

/**
 *
 * @author Adrian
 */
public class Proyecto1_Programacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
    int op;
    boolean salir = false;
       
    ArrayList <Cliente> listaCliente = new ArrayList<Cliente>();
       
       do {
        op = Integer.parseInt(JOptionPane.showInputDialog(
                  "1 - Incluir Cliente \n"
                + "2 - Buscar Cliente\n"
                + "3 - Eliminar Cliente\n"
                + "4 - Salir"));
              
        switch (op){
        
            case 1:
                Cliente newcliente = new Cliente();
                newcliente.SetId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID")));
                newcliente.SetNombre(JOptionPane.showInputDialog("Ingrese nombre"));
                newcliente.SetApellido(JOptionPane.showInputDialog("Ingrese apellido"));
                newcliente.SetGenero(JOptionPane.showInputDialog("Ingrese genero").charAt(0));
                newcliente.SetEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad")));
                newcliente.SetTelefono(JOptionPane.showInputDialog("Ingrese telefono"));
                newcliente.SetEmail(JOptionPane.showInputDialog("Ingrese Email"));
                newcliente.SetDireccionFisica(JOptionPane.showInputDialog("Ingrese direccion"));
                newcliente.GetDate();   
                listaCliente.add(newcliente);
                
                break;
                
                
                
            case 2:
                String info; 
                Iterator iter = listaCliente.iterator();
                boolean bandera = true;
                int id =0;
                id = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar ID del cliente").trim());
                while (iter.hasNext() && bandera==true){
                    
                    Cliente cliente1 = (Cliente)iter.next();
                    if (cliente1.GetId() == id){
                    info = "Informacion Cliente: " + 
                            "\nId del cliente: " + cliente1.GetId()+ "\n" + 
                            "Nombre: " + cliente1.GetNombre() + "\n"+ 
                            "Apellido: " + cliente1.GetApellido() + "\n"+
                            "Genero: " + cliente1.GetGenero()+ "\n"+
                            "Edad: " + cliente1.GetEdad()+ " Años\n" +
                            "Telefono: " + cliente1.GetTelefono()+ "\n"+
                            "Email: " + cliente1.GetEmail() + "\n"+ 
                            "Direccion: " + cliente1.GetDireccionFisica()+ "\n"+
                            "Fecha inclusion: " + cliente1.GetDate();
                    
                    JOptionPane.showMessageDialog(null,info );
                    bandera = false;
                   }   
                }
                
                if(bandera){
                    JOptionPane.showMessageDialog(null, "Cliente no encontrado", "Error",JOptionPane.ERROR_MESSAGE);
                }
                
                break;
                
            case 3:
                
                Iterator iter2= listaCliente.iterator();
                boolean bandera2 = true;
                int id1 =0;
                id = Integer.parseInt(JOptionPane.showInputDialog("Favor ingresar ID dle cliente").trim());
                while (iter2.hasNext() && bandera2==true){
                    
                    Cliente cliente1 = (Cliente)iter2.next();
                    if (cliente1.GetId() == id){
                    listaCliente.remove(cliente1);
                     bandera = false;
                    }   
                }
                if(bandera2){
                    
                    JOptionPane.showMessageDialog(null, "Cliente Eliminado", "Info",JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                        
            case 4:
                salir = true;
                break;
        }
        
       }while(!salir);
    }
    
}

    
    

package libreria;

import java.util.LinkedList;
import java.util.List;

public class Libreria {
    
    List<Cliente> clientes;
    
    public Libreria(){
        this.clientes = new LinkedList<Cliente>();
    }

    public void agregarRegistroCliente(Cliente unCliente) {
        this.clientes.add(unCliente);
    }
    
    public Cliente obtenerCliente(int id){

        Cliente clienteBuscado = null;
        for(int i=0;i<clientes.size();i++){
            if(this.clientes.get(i).getId()==id){
                clienteBuscado = this.clientes.get(i);
            }
        }
        return clienteBuscado;
    }
    
    public double obtenerTotalACobrarMensual(String mes){
        double totalMes=0.0;
        for(Cliente cliente: this.clientes){
            totalMes+= cliente.obtenerConsumoMensual(mes); 
        }
        return totalMes;
    }
}

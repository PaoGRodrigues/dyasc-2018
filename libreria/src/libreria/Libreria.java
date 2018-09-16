package libreria;

import java.util.HashMap;
import java.util.Map;

public class Libreria {
    
    Map<Integer,Cliente> clientes;
    
    public Libreria(){
        this.clientes = new HashMap<Integer,Cliente>();
    }

    public void agregarRegistroCliente(int idCliente,Cliente unCliente) {
        this.clientes.put(idCliente, unCliente);
    }
    
    public Cliente obtenerCliente(int id){
        return this.clientes.get(id);
    }
}
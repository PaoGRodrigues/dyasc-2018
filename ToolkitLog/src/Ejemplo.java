
public class Ejemplo {

    public static void main(String[] args){
        
        Bitacora bitacora = new Bitacora();
        Cliente cliente = new Cliente(bitacora);
        
        cliente.accion1();
        cliente.accion2();
        cliente.accion3();
    }
}


package libreria;

import org.junit.Test;

public class LibreriaTest {

    @Test
    public void agregarRegistroClienteALaLibreria(){
        
        Libreria libreria = new Libreria();
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        Cliente unCliente = new Cliente("Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(unCliente);
    }
    
    @Test
    public void agregarCuentaCorrienteACliente(){
        //Asumo que no todos los clientes tienen cuenta corriente
        
        
    }
}

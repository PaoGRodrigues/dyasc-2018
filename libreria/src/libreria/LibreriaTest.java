package libreria;

import org.junit.Test;

import junit.framework.Assert;

public class LibreriaTest {

    Libreria libreria;
    Cliente unCliente;
    
    public LibreriaTest(){
        this.libreria = new Libreria();
    }
    
    @Test
    public void agregarRegistroClienteALaLibreria(){
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        this.unCliente = new Cliente("Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(1,unCliente);
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void elClienteCompraUnLibroYSeAgregaALaCuentaCorriente(){
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        this.unCliente = new Cliente("Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(1,unCliente);
        
        Producto unLibro = new Libro(100);
        unCliente.registrarCompra("Septiembre",unLibro);
        
        Assert.assertEquals(unCliente.obtenerConsumoMensual("Septiembre"), 100);
    }
}

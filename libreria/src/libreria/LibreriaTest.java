package libreria;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class LibreriaTest {

    Libreria libreria;
    Cliente unCliente;
    
    public LibreriaTest(){
        this.libreria = new Libreria();
        CuentaCorriente nuevaCuenta = new CuentaCorriente(5566);
        Cliente nuevoCliente = new Cliente(0,"Pablo", "Los totora 999", nuevaCuenta);
        libreria.agregarRegistroCliente(nuevoCliente);
    }
    
    @Test
    public void agregarRegistroClienteALaLibreria(){
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        this.unCliente = new Cliente(1,"Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(unCliente);
        
        Assert.assertFalse(libreria.clientes.isEmpty());
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void elClienteCompraUnLibroYSeAgregaALaCuentaCorriente(){
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        this.unCliente = new Cliente(1,"Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(unCliente);
        
        Producto unLibro = new Libro(100);
        unCliente.registrarCompra("Septiembre",unLibro);
        
        Assert.assertEquals(unCliente.obtenerConsumoMensual("Septiembre"), 100.0);
    }
    
    @SuppressWarnings("deprecation")
    @Test
    public void elClienteCompraUnArticuloDeLibreriaYElPrecioEsConIVA(){
        
        Cliente comprador = libreria.obtenerCliente(0);
        Producto producto = new ArticuloDeLibreria(1000);
        comprador.registrarCompra("Octubre", producto);
        
        Assert.assertEquals(comprador.obtenerConsumoMensual("Octubre"), 1210.0);
    }
}

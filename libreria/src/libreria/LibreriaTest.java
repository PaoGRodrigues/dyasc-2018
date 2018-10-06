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
    
    @Test
    public void elClienteCompraUnLibroYSeAgregaALaCuentaCorriente(){
        
        CuentaCorriente cuenta = new CuentaCorriente(3355);
        this.unCliente = new Cliente(1,"Pedro", "Los corrales 225", cuenta);
        libreria.agregarRegistroCliente(unCliente);
        
        Producto unLibro = new Libro(100);
        unCliente.registrarCompra("Septiembre",unLibro);
        
        Assert.assertEquals(100.0, unCliente.obtenerConsumoMensual("Septiembre"));
    }
    
    @Test
    public void elClienteCompraUnArticuloDeLibreriaYElPrecioEsConIVA(){
        
        Cliente comprador = libreria.obtenerCliente(0);
        Producto producto = new ArticuloDeLibreria(1000);
        comprador.registrarCompra("Octubre", producto);
        
        Assert.assertEquals(1210.0,comprador.obtenerConsumoMensual("Octubre"));
    }
    
    @Test
    public void clienteCompraPeriodicoYSuPerioricidadEsDeDosVecesPorMesSiendoSuPrecioElDobleQueElPrecioPorUnoSolo(){
        Cliente comprador = libreria.obtenerCliente(0);
        Producto producto = new Periodico(45, 2);
        comprador.registrarCompra("Marzo", producto);
        
        Assert.assertEquals(90.0,comprador.obtenerConsumoMensual("Marzo"));
    }
    
    @Test
    public void clienteCompraPeriodicoYTieneSuscripcion(){
        Cliente comprador = libreria.obtenerCliente(0);
        Producto periodico = new Periodico(45,2);
        comprador.suscribir(Periodo.ANUAL);
        comprador.registrarCompra("Agosto",periodico);
        
        Assert.assertEquals(72.0,comprador.obtenerConsumoMensual("Agosto"));
    }
    
    @Test
    public void clienteCompraLibroYEstaSuscripto(){
        Cliente comprador = libreria.obtenerCliente(0);
        Producto libro = new Libro(45);
        comprador.suscribir(Periodo.ANUAL);
        comprador.registrarCompra("Agosto",libro);
        
        Assert.assertEquals(45.0,comprador.obtenerConsumoMensual("Agosto"));
    }
}

package libreria;

import org.junit.Test;

public class LibreriaTest {

    @Test
    public void agregarRegistroClienteALaLibreria(){
        
        Libreria libreria = new Libreria();
        
        libreria.agregarRegistroCliente("Pedro", "Los corrales 225");
    }
}

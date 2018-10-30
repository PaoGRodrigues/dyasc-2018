import org.junit.Assert;
import org.junit.Test;

public class BatallaNavalTest {

    public Tablero tablero = new Tablero(8);
    
    @Test
    public void seCreaElTablero(){      
        Tablero tablero2 = new Tablero(8);
        Casillero unCasillero = new CasilleroAgua(Estado.AGUA,"4","G");
        Assert.assertTrue(unCasillero.getClass().isInstance(tablero2.obtenerCasillero("4","G")));
    }
    
    @Test
    public void seCreaTodoElTableroConCasillerosAgua(){
        Casillero unCasillero = new CasilleroAgua(Estado.AGUA,"1", "B");
        Assert.assertTrue(unCasillero.getClass().isInstance(this.tablero.obtenerCasillero("1", "B")));
    }
    
    
    @Test
    public void seAgregaUnBote(){     
        this.tablero.agregarBote("1","A");
        Assert.assertTrue(this.tablero.obtenerCasillero("1", "A").obtenerEstado().equals(Estado.VIVO));
        Assert.assertTrue(this.tablero.obtenerCasillero("3", "F").obtenerEstado().equals(Estado.AGUA));
    }
    
    @Test
    public void seAgregaUnCrucero(){
        this.tablero.agregarCrucero("2","B","derecha");
        Assert.assertEquals(Estado.VIVO, this.tablero.obtenerCasillero("2", "C").obtenerEstado());
    }
    
    @Test(expected = RuntimeException.class)
    public void seAgregaBoteEnUnCasilleroInvalido(){
        this.tablero.agregarBote("9","Z");
    }
    
    @Test(expected = RuntimeException.class)
    public void seAgregaCruceroHaciaLaDerechaConUnCasilleroInvalido(){
        this.tablero.agregarCrucero("2","L", "derecha");
    }
    
    @Test(expected = RuntimeException.class)
    public void seAgregaCruceroHaciaAbajoConUnCasilleroInvalido(){
        this.tablero.agregarCrucero("45","B", "abajo");
    }
    
    @Test(expected = RuntimeException.class)
    public void seAgregaCruceroHaciaArribaConUnCasilleroInvalido(){
        this.tablero.agregarCrucero("2","B", "arriba");
    }
    
    @Test
    public void seAgregaCruceroHaciaArribaConUnCasilleroValido(){
        this.tablero.agregarCrucero("3","B", "arriba");
        this.tablero.agregarCrucero("8","B", "arriba");
        this.tablero.agregarCrucero("8","H", "arriba");
    }
    
    @Test
    public void disparaAUnCasilleroBoteYLoHunde(){
        this.tablero.agregarBote("1", "A");
        this.tablero.recibirDisparo("1", "A");
        Assert.assertEquals(Estado.HUNDIDO, this.tablero.obtenerCasillero("1", "A").obtenerEstado());
    }
    
    @Test
    public void disparaAUnCasilleroCruceroNoLoHunde(){
        this.tablero.agregarCrucero("1", "A", "derecha");
        this.tablero.recibirDisparo("1", "A");
        this.tablero.recibirDisparo("1", "B");
        this.tablero.recibirDisparo("1", "C");
        
        Assert.assertEquals(Estado.TOCADO, this.tablero.obtenerCasillero("1", "A").obtenerEstado());
        Assert.assertEquals(Estado.TOCADO, this.tablero.obtenerCasillero("1", "B").obtenerEstado());
        Assert.assertEquals(Estado.TOCADO, this.tablero.obtenerCasillero("1", "C").obtenerEstado());
    }
}

import org.junit.Assert;
import org.junit.Test;

public class BatallaNavalTest {

    public Tablero tablero = new Tablero(8);
    
    @Test
    public void seCreaElTablero(){      
        Tablero tablero2 = new Tablero(8);
        Casillero unCasillero = new CasilleroAgua(Estado.AGUA);
        Assert.assertTrue(unCasillero.getClass().isInstance(tablero2.obtenerCasillero("4","G")));
    }
    
    @Test
    public void seCreaTodoElTableroConCasillerosAgua(){
        Casillero unCasillero = new CasilleroAgua(Estado.AGUA);
        Assert.assertTrue(unCasillero.getClass().isInstance(this.tablero.obtenerCasillero("1", "B")));
    }
    
    @Test
    public void seAgregaUnBote(){     
        this.tablero.agregarBote("1","A");
        Assert.assertTrue(this.tablero.obtenerCasillero("1", "A").obtenerEstado().equals(Estado.VIVO));
        Assert.assertTrue(this.tablero.obtenerCasillero("3", "F").obtenerEstado().equals(Estado.AGUA));
    }
}

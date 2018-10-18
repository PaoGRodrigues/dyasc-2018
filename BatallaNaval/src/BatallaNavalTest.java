import org.junit.Assert;
import org.junit.Test;

public class BatallaNavalTest {

    @Test
    public void seCreaElTablero(){
        Tablero tablero = new Tablero(8);             
        tablero.getCasillero("1","A");
        Casillero unCasillero = new Casillero();
        Assert.assertTrue(unCasillero.getClass().isInstance(tablero.getCasillero("4","G")));
    }
    
    @Test
    public void seCreaTodoElTableroConCasillerosAgua(){
        Tablero tablero2 = new Tablero(8);
        Casillero unCasillero = new CasilleroAgua();
        Assert.assertTrue(unCasillero.getClass().isInstance(tablero2.getCasillero("1", "B")));
    }
}

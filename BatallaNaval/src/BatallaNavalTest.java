import org.junit.Test;

public class BatallaNavalTest {

    @Test
    public void seCreaElTablero(){
        Tablero tablero = new Tablero(8);
        
        tablero.ubicarBote("1","A");
                
        tablero.getCasillero("1","A");
    }
}

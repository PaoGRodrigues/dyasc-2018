import java.util.LinkedList;
import java.util.List;

public class UbicadorAbajo implements UbicadorCrucero{

    @Override
    public List<CasilleroBote> ubicar(String fila, String columna) {
        List<CasilleroBote> casilleros = new LinkedList<CasilleroBote>();
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, columna));
        casilleros.add(new CasilleroBote(Estado.VIVO, Integer.toString(Integer.parseInt(fila)+1), columna));
        casilleros.add(new CasilleroBote(Estado.VIVO, Integer.toString(Integer.parseInt(fila)+2), columna));
        return casilleros;
    }

}

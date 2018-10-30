import java.util.LinkedList;
import java.util.List;

public class UbicadorIzquierda implements UbicadorCrucero{

    @Override
    public List<CasilleroBote> ubicar(String fila, String columna) {
        List<CasilleroBote> casilleros = new LinkedList<CasilleroBote>();
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, columna));
        String anteriorColumna = obtenerLetraAnterior(columna);
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, anteriorColumna));
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, obtenerLetraAnterior(anteriorColumna)));
        return casilleros;
    }

    private String obtenerLetraAnterior(String letra){
        int charValue = letra.charAt(0);
        String next = String.valueOf((char)(charValue-1));
        return next;
    }
}

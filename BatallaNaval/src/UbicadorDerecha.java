import java.util.LinkedList;
import java.util.List;

public class UbicadorDerecha implements UbicadorCrucero{

    @Override
    public List<CasilleroBote> ubicar(String fila, String columna) {
        List<CasilleroBote> casilleros = new LinkedList<CasilleroBote>();
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, columna));
        String siguienteColumna = obtenerSiguienteLetra(columna);
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, siguienteColumna));
        casilleros.add(new CasilleroBote(Estado.VIVO, fila, obtenerSiguienteLetra(siguienteColumna)));
        return casilleros;
    }
    
    private String obtenerSiguienteLetra(String letra){
        int charValue = letra.charAt(0);
        String next = String.valueOf((char)(charValue+1));
        return next;
    }
}

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Tablero {

    List<Casillero> casilleros;
    
    public Tablero(int tamano){
        this.casilleros = new LinkedList<Casillero>();
        this.crearTablero(tamano);
    }

    private void crearTablero(int tamano){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Casillero nuevoCasillero;
        for(int i = 0; i<tamano; i++){
            for(int j= 0; j<tamano; j++){
                nuevoCasillero = new CasilleroAgua(Estado.AGUA, Integer.toString(i+1),alfabeto.substring(j, j+1));
                this.casilleros.add(nuevoCasillero);
            }
        }
    }
    
    public Casillero obtenerCasillero(String fila, String columna) {
        List<Casillero> listaCasilleros = this.casilleros.stream().filter(casillero -> casillero.obtenerFila().equals(fila) && 
                casillero.obtenerColumna().equals(columna)).collect(Collectors.toList());
        return listaCasilleros.get(0);
    }
    
    
    public void agregarBote(String fila, String columna) {
        Casillero unBote = new CasilleroBote(Estado.VIVO, fila, columna);
        Map<String, Casillero> filaBuscada = this.casilleros.get(fila);
        filaBuscada.replace(columna, unBote);
    }
    /*
    public void agregarCrucero(String fila, String columna, String direccion) {
        Casillero unCrucero = new Crucero(Estado.VIVO, fila, columna, direccion);
        Map<String, Casillero> filaBuscada = this.casilleros.get(fila);
        filaBuscada.replace(columna, unCrucero);
    }*/
}

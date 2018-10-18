import java.util.HashMap;
import java.util.Map;

public class Tablero {

    Map<String, Map<String, Casillero>> casilleros;
    
    public Tablero(int tamano){
        this.crearTablero(tamano);
    }

    private void crearTablero(int tamano){
        this.casilleros = this.crearFilas(tamano);
    }
    
    private Map<String, Map<String, Casillero>> crearFilas(int tamano){
        Map<String, Map<String, Casillero>> filas = new HashMap<String, Map<String, Casillero>>();
        for(int i = 1; i<=tamano; i++){
            filas.put(Integer.toString(i), this.crearColumnas(tamano));
        }
        return filas;
    }
    
    private Map<String, Casillero> crearColumnas(int tamano){
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Map<String, Casillero> columnas = new HashMap<String, Casillero>();
        Casillero unCasillero;
        for(int i=0; i<tamano;i++){
            unCasillero = new CasilleroAgua();
            columnas.put(alfabeto.substring(i, i+1) , unCasillero);
        }
        return columnas;
    }
    
    public Casillero getCasillero(String fila, String columna) {
        return this.casilleros.get(fila).get(columna);
    }
}

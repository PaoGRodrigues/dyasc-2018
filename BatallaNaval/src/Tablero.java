import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Tablero {

    private List<Casillero> casilleros;
    private int tamano;

    public Tablero(int tamano){
        this.tamano = tamano;
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
        // Filtro la lista por los casilleros que tienen el valor fila/columna.
        // En el caso de que devuelva 0, entonces ese casillero esta fuera de el tablero.
        if(listaCasilleros.size()!=0){
            return listaCasilleros.get(0);
        }else{
            throw new RuntimeException("Opción no válida.");
        }
    }

    public void agregarBote(String fila, String columna) {

        Casillero unBote = new CasilleroBote(Estado.VIVO, fila, columna);
        Casillero elCasillero = this.obtenerCasillero(fila,columna);
        this.casilleros.remove(elCasillero);
        this.casilleros.add(unBote);
    }

    public void agregarCrucero(String fila, String columna, String direccion) {
        Crucero unCrucero = new Crucero(Estado.VIVO, fila, columna, direccion);
        ValidadorUbicacion validador = ValidadorFactory.crearValidador(direccion);
        if(validador.validarUbicacion(fila,columna,this.tamano)){
            List<CasilleroBote> casillerosCrucero = unCrucero.obtenerCrucero();
            for(Casillero casillero: casillerosCrucero){
                Casillero unCasillero = this.obtenerCasillero(casillero.obtenerFila(), casillero.obtenerColumna());
                this.casilleros.remove(unCasillero);
            }
            this.casilleros.addAll(casillerosCrucero);
        }else{
            throw new RuntimeException("Ubicación no válida.");
        }
    }
}

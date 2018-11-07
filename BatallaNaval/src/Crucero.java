import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Crucero extends Casillero {

    List<CasilleroBote> casilleros;
    List<String> ubicaciones;
    
    public Crucero(Estado unEstado, String fila, String columna, String direccion) {
        super(unEstado, fila, columna);
        this.casilleros = new ArrayList<CasilleroBote>();
        this.ubicaciones = new ArrayList<String>();
        this.ubicarCrucero(direccion);
    }

    @Override
    public void cambiarEstado(Estado nuevoEstado) {
        for(CasilleroBote casillero: casilleros){
            casillero.cambiarEstado(nuevoEstado);
        }
    }
    
    public void ubicarCrucero(String direccion){
        UbicadorCrucero ubicador = UbicadorFactory.crearUbicador(direccion);
        this.casilleros = ubicador.ubicar(this.fila, this.columna);
        for(int i=0; i<this.casilleros.size(); i++){
            this.ubicaciones.add(this.casilleros.get(i).obtenerFila().concat(this.casilleros.get(i).obtenerColumna()));
        }
    }
    
    public List<CasilleroBote> obtenerCrucero(){
        return this.casilleros;
    }
    
    public boolean perteneceAlCrucero(String fila, String columna){
        if(this.casilleros.stream().filter(casillero -> casillero.obtenerFila().equals(fila) && 
                casillero.obtenerColumna().equals(columna)).collect(Collectors.toList()).size()!=0){
            return true;
        }
        return false;
    }
    
    public boolean estaHundido(){
        return (this.casilleros.stream().allMatch(casillero->casillero.obtenerEstado()==Estado.TOCADO));
    }
    
}

import java.util.ArrayList;
import java.util.List;

public class Crucero extends Casillero {

    List<CasilleroBote> casilleros;
    
    public Crucero(Estado unEstado, String fila, String columna, String direccion) {
        super(unEstado, fila, columna);
        this.casilleros = new ArrayList<CasilleroBote>();
        this.ubicarCrucero(direccion);
    }

    @Override
    public void cambiarEstado() {
        for(CasilleroBote casillero: casilleros){
            if(casillero.obtenerEstado().equals(Estado.TOCADO)){
                this.estado = Estado.HUNDIDO;
            }
        }
    }
    
    public void ubicarCrucero(String direccion){
        UbicadorCrucero ubicador = UbicadorFactory.crearUbicador(direccion);
        this.casilleros = ubicador.ubicar(this.fila, this.columna);
    }
    
    public List<CasilleroBote> obtenerCrucero(){
        return this.casilleros;
    }
}

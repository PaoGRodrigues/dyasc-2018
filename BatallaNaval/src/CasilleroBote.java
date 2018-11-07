
public class CasilleroBote extends Casillero{

    public CasilleroBote(Estado unEstado, String fila, String columna) {
        super(unEstado, fila, columna);
    }

    @Override
    public void cambiarEstado(Estado nuevoEstado) {
        this.estado = nuevoEstado;        
    }
   
    public Estado obtenerEstado(){
        return this.estado;
    }
}

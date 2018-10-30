
public class CasilleroBote extends Casillero{

    public CasilleroBote(Estado unEstado, String fila, String columna) {
        super(unEstado, fila, columna);
    }

    @Override
    public void cambiarEstado(Estado nuevoEstado) {
        if(this.estado.equals(Estado.VIVO)){
            this.estado = nuevoEstado;
        }
    }
   
}


public class CasilleroBote extends Casillero {

    public CasilleroBote(Estado unEstado, String fila, String columna) {
        super(unEstado, fila, columna);
    }

    @Override
    public void cambiarEstado() {
        if(this.estado.equals(Estado.VIVO)){
            this.estado = Estado.HUNDIDO;
        }
    }
}

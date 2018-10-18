
public class CasilleroBote extends Casillero {

    public CasilleroBote(Estado unEstado) {
        super(unEstado);
    }

    @Override
    public void cambiarEstado() {
        if(this.estado.equals(Estado.VIVO)){
            this.estado = Estado.HUNDIDO;
        }
    }

    
}

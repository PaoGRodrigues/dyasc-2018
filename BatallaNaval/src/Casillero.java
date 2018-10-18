
public abstract class Casillero {

    protected Estado estado;
    
    public Casillero(Estado unEstado){
        this.estado = unEstado;
    }
    
    public Estado obtenerEstado() {
        return estado;
    }
    
    public abstract void cambiarEstado();
}

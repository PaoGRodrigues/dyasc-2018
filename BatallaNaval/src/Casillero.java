
public abstract class Casillero {

    protected Estado estado;
    protected String fila;
    protected String columna;
    
    public Casillero(Estado unEstado, String fila, String columna){
        this.estado = unEstado;
        this.fila = fila;
        this.columna = columna; 
    }
    
    public Estado obtenerEstado() {
        return estado;
    }
    
    public String obtenerFila(){
        return this.fila;
    }
    
    public String obtenerColumna(){
        return this.columna;
    }
    
    public abstract void cambiarEstado(Estado nuevoEstado);
}

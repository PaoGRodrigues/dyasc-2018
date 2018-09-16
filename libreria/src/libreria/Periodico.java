package libreria;

public class Periodico extends Producto {

    private int periodicidad;
    
    public Periodico(int precio, int periodicidad) {
        super(precio);
        this.periodicidad = periodicidad;
    }

    @Override
    public double obtenerPrecio() {
        return (this.precio*this.periodicidad);
    }

}

package libreria;

public class Periodico extends Producto implements Suscripcion{

    private int periodicidad;
    
    public Periodico(double precio, int periodicidad) {
        super(precio);
        this.periodicidad = periodicidad;
    }

    @Override
    public double obtenerPrecio() {
        return this.precio;
    }

    @Override
    public double establecerPrecioSuscripto() {
        this.precio = ((this.precio*0.8)*this.periodicidad);
        return this.precio;
    }

    @Override
    public String obtenerTipoProducto() {
        return "Periodico";
    }

    @Override
    public void establecerPrecio() {
        this.precio = (this.precio*this.periodicidad);
    }
}

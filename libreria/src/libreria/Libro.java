package libreria;

public class Libro extends Producto {

    public Libro(int precio) {
        super(precio);
    }

    @Override
    public double obtenerPrecio() {
        return this.precio;
    }

    @Override
    public String obtenerTipoProducto() {
        return "Libro";
    }

    @Override
    public void establecerPrecio() {}

}

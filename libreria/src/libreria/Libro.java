package libreria;

public class Libro extends Producto {

    public Libro(int precio) {
        super(precio);
    }

    @Override
    public double obtenerPrecio() {
        return this.precio;
    }

}

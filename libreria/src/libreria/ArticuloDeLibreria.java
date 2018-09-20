package libreria;

public class ArticuloDeLibreria extends Producto {
    
    public ArticuloDeLibreria(int precio) {
        super(precio);
    }
    
    @Override
    public double obtenerPrecio() {
        return this.precio;
    }

    @Override
    public String obtenerTipoProducto() {
        return "ArticuloDeLibreria";
    }

    @Override
    public void establecerPrecio() {
        this.precio = (this.precio + (this.precio * 0.21));
    }

}

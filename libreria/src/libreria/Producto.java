package libreria;

public abstract class Producto {
    
    protected double precio;
    public Producto(int precio){
        this.precio = precio;
    }
    
    public abstract double obtenerPrecio();
    public abstract void establecerPrecio();
    public abstract String obtenerTipoProducto();
}

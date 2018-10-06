package libreria;

public abstract class Producto {
    
    protected double precio;
    public Producto(double precio){
        this.precio = precio;
    }
    
    public abstract double obtenerPrecio();
    public abstract void establecerPrecio();
    public abstract String obtenerTipoProducto();
}

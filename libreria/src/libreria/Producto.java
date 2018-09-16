package libreria;

public abstract class Producto {
    
    protected double precio;
    public Producto(int precio){
        this.precio = precio;
    }
    
    public abstract double obtenerPrecio();
}

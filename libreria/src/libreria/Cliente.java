package libreria;

public class Cliente {
    
    private String nombre;
    private String direccion;
    private CuentaCorriente cuenta;
    
    public Cliente(String nombre, String direccion, CuentaCorriente unaCuenta){
        this.nombre = nombre;
        this.direccion = direccion;
        this.cuenta = unaCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public void registrarCompra(String mes,Producto unProducto) {
        this.cuenta.agregarCompra(mes, unProducto, unProducto.obtenerPrecio());
    }
    
    public int obtenerConsumoMensual(String mes){
        return this.cuenta.obtenerTotalMes(mes);
    }
}

package libreria;

import java.util.HashMap;
import java.util.Map;

public class CuentaCorriente {

    private int numeroDeCuenta;
    private Map<String,Map<Producto,Integer>> consumos;
    
    public CuentaCorriente(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
        this.consumos = new HashMap<String, Map<Producto,Integer>>();
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void agregarNuevoMes(String mes){
        Map<Producto,Integer> nuevoMes = new HashMap<Producto, Integer>();
        this.consumos.put(mes, nuevoMes);
    }
    
    public void agregarCompra(String mes,Producto unProducto, int precio) {
        if(this.consumos.containsKey(mes)){
            this.consumos.get(mes).put(unProducto, precio);
        }
    }
    
    
}

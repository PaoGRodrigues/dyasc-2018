package libreria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CuentaCorriente {

    private int numeroDeCuenta;
    private Map<String,Map<Producto,Double>> consumos;
    
    public CuentaCorriente(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
        this.consumos = new HashMap<String, Map<Producto,Double>>();
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void agregarNuevoMes(String mes){
        Map<Producto,Double> nuevoMes = new HashMap<Producto, Double>();
        this.consumos.put(mes, nuevoMes);
    }
    
    public void agregarCompra(String mes,Producto unProducto, double precio) {
        if(!this.consumos.containsKey(mes)){
            this.agregarNuevoMes(mes);
        }
        this.consumos.get(mes).put(unProducto, precio);
    }
    
    public Map<Producto,Double> obtenerConsumos(String mes){
        return this.consumos.get(mes);
    }
    
    public double obtenerTotalMes(String mes){
        Map<Producto,Double> productos = this.obtenerConsumos(mes);
        double total = 0;
        
        Iterator<Double> iterador = productos.values().iterator();
        
        while(iterador.hasNext()){
            total+=iterador.next().intValue();
        }
        
        return total;
    }
}

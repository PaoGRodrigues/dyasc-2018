package libreria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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
        if(!this.consumos.containsKey(mes)){
            this.agregarNuevoMes(mes);
        }
        this.consumos.get(mes).put(unProducto, precio);
    }
    
    public Map<Producto,Integer> obtenerConsumos(String mes){
        return this.consumos.get(mes);
    }
    
    public int obtenerTotalMes(String mes){
        Map<Producto,Integer> productos = this.obtenerConsumos(mes);
        int total = 0;
        
        Iterator<Integer> iterador = productos.values().iterator();
        
        while(iterador.hasNext()){
            total+=iterador.next().intValue();
        }
        
        return total;
    }
}

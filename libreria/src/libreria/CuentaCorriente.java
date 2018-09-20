package libreria;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CuentaCorriente {

    private int numeroDeCuenta;
    private Map<String,List<Producto>> consumos;
    
    public CuentaCorriente(int numeroDeCuenta){
        this.numeroDeCuenta = numeroDeCuenta;
        this.consumos = new HashMap<String, List<Producto>>();
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void agregarNuevoMes(String mes){
        List<Producto> nuevoMes = new LinkedList<Producto>();
        this.consumos.put(mes, nuevoMes);
    }
    
    public void agregarCompra(String mes,Producto unProducto, double precio) {
        if(!this.consumos.containsKey(mes)){
            this.agregarNuevoMes(mes);
        }
        this.consumos.get(mes).add(unProducto);
    }
    
    public List<Producto> obtenerListaProductos(String mes){
        return this.consumos.get(mes);
    }
    
    public double obtenerTotalMes(String mes){
        List<Producto> productos = this.obtenerListaProductos(mes);
        double total = 0;
        
        Iterator<Producto> iterador = productos.iterator();
        
        while(iterador.hasNext()){
            total+=iterador.next().obtenerPrecio();
        }
        
        return total;
    }
}

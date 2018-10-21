import java.util.ArrayList;
import java.util.List;

public class Crucero extends Casillero {

    List<CasilleroBote> casilleros;
    
    public Crucero(Estado unEstado, String fila, String columna, String direccion) {
        super(unEstado, fila, columna);
        this.casilleros = new ArrayList<CasilleroBote>();
    }

    @Override
    public void cambiarEstado() {
        for(CasilleroBote casillero: casilleros){
            if(casillero.obtenerEstado().equals(Estado.TOCADO)){
                this.estado = Estado.HUNDIDO;
            }
        }
    }
    
    public void ubicarCrucero(){
        this.casilleros.add(new CasilleroBote(this.estado, fila, columna));
        String siguienteColumna = obtenerSiguienteLetra(columna);
        this.casilleros.add(new CasilleroBote(this.estado, fila, siguienteColumna));
        this.casilleros.add(new CasilleroBote(this.estado, fila, obtenerSiguienteLetra(siguienteColumna)));
    }
    
    private String obtenerSiguienteLetra(String letra){
        int charValue = letra.charAt(0);
        String next = String.valueOf((char)(charValue+1));
        return next;
    }
}

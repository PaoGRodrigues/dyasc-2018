import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bitacora {
    
    private Impresor impresor;
    
    public Bitacora(){
        this.impresor = ImpresorFactory.crearImpresor();
    }
    
    public synchronized void registrar(String evento){
        
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm");
        String fechaFormateada = fecha.format(formateador);
        String registro = fechaFormateada.concat(" " + evento + "\n");
        
        impresor.imprimir(registro);
    }
}

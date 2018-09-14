import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bitacora {

    public void registrar(String evento){
        
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm");
        String fechaFormateada = fecha.format(formateador);
        
        System.out.println(fechaFormateada + " " + evento);
    }
}

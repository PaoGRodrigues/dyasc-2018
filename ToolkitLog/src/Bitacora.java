import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bitacora {

    private PrintStream impresor;
    
    public Bitacora(){
        this.modificarArchivo("bitacora.txt");
    }
    
    public synchronized void registrar(String evento){
        
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/mm/yyyy hh:mm");
        String fechaFormateada = fecha.format(formateador);
        String registro = fechaFormateada.concat(" " + evento + "\n");
        System.out.print(registro);
        this.impresor.print(registro);
    }
    
    public void modificarArchivo(String archivo){
        File nuevoArchivo = new File(archivo);
        try{
            this.impresor = new PrintStream(nuevoArchivo);
        }catch(FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

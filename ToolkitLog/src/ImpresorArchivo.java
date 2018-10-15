import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ImpresorArchivo implements Impresor{

    private PrintStream impresor;

    public ImpresorArchivo(String archivo){
        try{
            this.impresor = new PrintStream(archivo);
        }catch(FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void imprimir(String registro) {
        this.impresor.print(registro);
    }
    
    public void cerrarImpresor(){
        this.impresor.close();
    }
}

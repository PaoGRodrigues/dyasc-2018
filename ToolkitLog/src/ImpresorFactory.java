
public class ImpresorFactory {

    public static Impresor crearImpresor(){
        
        Impresor impresor;
        
        if(System.getProperty("bitacora.destino").equals("CONSOLA")){
            impresor = new ImpresorConsola();
        }else{
            String archivo = System.getProperty("bitacora.destino");
            impresor = new ImpresorArchivo(archivo);
        }
        
        return impresor;
    }
}

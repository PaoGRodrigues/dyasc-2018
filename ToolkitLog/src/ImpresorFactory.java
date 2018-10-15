
public class ImpresorFactory {

    public static Impresor crearImpresor(){
        
        ImpresorCompuesto impresor = new ImpresorCompuesto();
        
        String variable = System.getProperty("bitacora.destino");
        
        if(variable!=null){
            String[] destinos = variable.split(",");
        
            for(String destino: destinos){
                if(destino.equals("CONSOLA")){
                    impresor.agregarImpresor(new ImpresorConsola());
                }else{
                    impresor.agregarImpresor(new ImpresorArchivo(destino));
                }
            }
        }
        return impresor;
    }
}

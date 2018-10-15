
public class Cliente {

    private Bitacora bitacora;
    
    public Cliente(Bitacora bitacora){
        this.bitacora = bitacora;
    }
    
    public void accion1(){
        this.bitacora.registrar("Iniciando ejecución");
    }
    
    public void accion2(){
        this.bitacora.registrar("Continuando ejecución");
    }
    
    public void accion3(){
        this.bitacora.registrar("Ejecución terminada");
    }
}

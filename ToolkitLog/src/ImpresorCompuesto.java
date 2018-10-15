import java.util.ArrayList;
import java.util.List;

public class ImpresorCompuesto implements Impresor{

    private List<Impresor> impresores;
    
    public ImpresorCompuesto(){
        this.impresores = new ArrayList<Impresor>();
    }
    
    public void agregarImpresor(Impresor impresor){
        this.impresores.add(impresor);
    }
    
    @Override
    public void imprimir(String registro) {
        for(Impresor impresor: impresores){
            impresor.imprimir(registro);
        }
    }

}

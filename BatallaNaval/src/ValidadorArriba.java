
public class ValidadorArriba implements ValidadorUbicacion{

    @Override
    public boolean validarUbicacion(String fila, String columna, int tamano) {
        
        int num_fila = Integer.parseInt(fila);
        if(num_fila>1 && num_fila-1>1 && num_fila-2>=1){
            return true;
        }
        return false;
    }

    
}

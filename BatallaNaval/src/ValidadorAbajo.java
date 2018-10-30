
public class ValidadorAbajo implements ValidadorUbicacion{

    @Override
    public boolean validarUbicacion(String fila, String columna, int tamano) {
        
        int num_fila = Integer.parseInt(fila);
        if(num_fila<tamano && num_fila-1<tamano && num_fila-2<tamano){
            return true;
        }
        return false;
    }    
}

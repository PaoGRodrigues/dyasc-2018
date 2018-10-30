
public class ValidadorDerecha implements ValidadorUbicacion{

    @Override
    public boolean validarUbicacion(String fila, String columna, int tamano) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num_columna = alfabeto.indexOf(columna);
        if(num_columna<tamano && num_columna+1<tamano && num_columna+2<tamano){
            return true;
        } 
        return false;
    }
}

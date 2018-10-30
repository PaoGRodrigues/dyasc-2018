
public class ValidadorIzquierda implements ValidadorUbicacion{

    @Override
    public boolean validarUbicacion(String fila, String columna, int tamano) {
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num_columna = alfabeto.indexOf(columna);
        if(num_columna<0 && num_columna-1<0 && num_columna-2<=0){
            return true;
        }
        return false;
    }
}

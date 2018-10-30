
public class ValidadorFactory {

    public static ValidadorUbicacion crearValidador(String ubicacion){
        ValidadorUbicacion validador;
        if(ubicacion.equals("derecha")){
            validador = new ValidadorDerecha();
        }else if(ubicacion.equals("izquierda")){
            validador = new ValidadorIzquierda();
        }else if(ubicacion.equals("arriba")){
            validador = new ValidadorArriba();
        }else if(ubicacion.equals("abajo")){
            validador = new ValidadorAbajo();
        }else{
            throw new RuntimeException("Opción no válida.");
        }
        return validador;
    }
}

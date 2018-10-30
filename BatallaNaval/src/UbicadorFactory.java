
public class UbicadorFactory {

    public static UbicadorCrucero crearUbicador(String direccion){
        UbicadorCrucero ubicador;
        if(direccion.equals("derecha")){
            ubicador = new UbicadorDerecha();
        }else if(direccion.equals("izquierda")){
            ubicador = new UbicadorIzquierda();
        }else if(direccion.equals("arriba")){
            ubicador = new UbicadorArriba();
        }else if(direccion.equals("abajo")){
            ubicador = new UbicadorAbajo();
        }else{
            throw new RuntimeException("Opción no válida.");
        }
        return ubicador;
    }
}

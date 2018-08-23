package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

        if(args.length==1){
            orientacionDefault(Integer.parseInt(args[0]));
        }else{
            String orientacion = args[0].split("=")[1];
            int numeroIngresado = Integer.parseInt(args[1]);
            
            if(orientacion.equals("vd")){
                verticalDirecta(numeroIngresado);
            }else if(orientacion.equals("hi")){
                horizontalInversa(numeroIngresado);
            }else if(orientacion.equals("vi")){
                verticalInversa(numeroIngresado);
            }else{
                System.out.println("Opciones no validas.");
            }
        }
    }
    
    private static int[] fibonacci(int numeroIngresado){
        int[] serie = new int[numeroIngresado];
        serie[0]=0;
        serie[1]=1;
        
        for(int i=2; i <=numeroIngresado-1; i++){
            serie[i] = serie[i-1] + serie[i-2];
        }
        return serie;
    }
    
    public static void orientacionDefault(int numeroIngresado){
        int[] serie = fibonacci(numeroIngresado);
        System.out.print("fibo<" + numeroIngresado + ">: ");
        for(int i=0; i<=serie.length-1; i++){
            System.out.print(serie[i] + " ");
        }
    }
    
    public static void verticalDirecta(int numeroIngresado){
        int[] serie = fibonacci(numeroIngresado);
        System.out.println("fibo<" + numeroIngresado + ">: ");
        for (int i=0; i <= serie.length-1; i++) {
            System.out.println(serie[i] + " ");
        }
    }
    
    public static void horizontalInversa(int numeroIngresado){
        int[] serie = fibonacci(numeroIngresado);
        System.out.print("fibo<" + numeroIngresado + ">: ");
        for(int i=serie.length-1; i>=0; i--){
            System.out.print(serie[i] + " ");
        }
    }
    
    public static void verticalInversa(int numeroIngresado){
        int[] serie = fibonacci(numeroIngresado);
        System.out.println("fibo<" + numeroIngresado + ">: ");
        for (int i=serie.length-1; i>=0; i--) {
            System.out.println(serie[i] + " ");
        }
    }
}
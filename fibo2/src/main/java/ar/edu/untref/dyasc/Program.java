package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

        if(args.length==1){
            orientacionDefault(Integer.parseInt(args[0]));
        }else{
            String orientacion = args[3];
            String direccion = args[4];
            
            if(orientacion=="v" && direccion=="d"){
                verticalDirecta(Integer.parseInt(args[6]));
            }else if(orientacion=="h" && direccion=="i"){
                horizontalInversa(Integer.parseInt(args[6]));
            }else if(orientacion=="v" && direccion=="i"){
                
            }else{
                System.out.println("Opciones no validas.");
            }
        }
    }
    
    public static int[] fibonacci(int numeroIngresado){
        int[] serie = new int[numeroIngresado];
        serie[0]=0;
        serie[1]=1;
        
        for(int i=2; i <=numeroIngresado; i++){
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
        for(int i=serie.length; i>=0; i--){
            System.out.print(serie[i] + " ");
        }
    }
}
package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

        if(args.length==1){
            
            orientacion_default(Integer.parseInt(args[0]));
        }else{
            String orientacion = args[3];
            String direccion = args[4];
            
            if(orientacion=="v" && direccion=="d"){
                
            }else if(orientacion=="h" && direccion=="i"){
                
            }else if(orientacion=="v" && direccion=="i"){
                
            }else{
                System.out.println("Opciones no validas.");
            }
        }
        
        
    }
    
    public static void orientacion_default(int numeroIngresado){
        int numero1 = 0;
        int numero2 = 1;

        System.out.print("fibo<" + numeroIngresado + ">: " + numero1 + " ");
        for (int i = 2; i <= numeroIngresado; i++) {
            System.out.print(numero2 + " ");
            numero2 = numero1 + numero2;
            numero1 = numero2 - numero1;
        }
        System.out.println();
    }
}
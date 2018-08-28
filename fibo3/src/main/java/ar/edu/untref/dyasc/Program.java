package ar.edu.untref.dyasc;

public class Program {

    
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
    
    
}
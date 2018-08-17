package ar.edu.untref.dyasc;

public class Program {

    public static void main(String[] args) {

    	int numeroIngresado = Integer.parseInt(args[0]);
    	
    	int numero1=0;
    	int numero2=1;

    	System.out.print("Fibo<" + args[0] + ">:" + numero1 + " ");
    	for(int i=2;i<=numeroIngresado;i++){
    	     System.out.print(numero2 + " ");
    	     numero2 = numero1 + numero2;
    	     numero1 = numero2 - numero1;
    	}
    	System.out.println();
    }
}



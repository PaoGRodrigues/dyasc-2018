package ar.edu.untref.dyasc;

public class Printer {

    public Printer(FiboCalculator fibo, Interpreter interpreter){
        System.out.print("fibo<" + fibo.getNumber() + ">: ");
    }
    
    public static void orientacionDefault(){
        for(int i=0; i<=serie.length-1; i++){
            System.out.print(serie[i] + " ");
        }
    }
    
    public static void verticalDirecta(int numeroIngresado){
        System.out.println("fibo<" + numeroIngresado + ">: ");
        for (int i=0; i <= serie.length-1; i++) {
            System.out.println(serie[i] + " ");
        }
    }
    
    public static void horizontalInversa(int numeroIngresado){
        System.out.print("fibo<" + numeroIngresado + ">: ");
        for(int i=serie.length-1; i>=0; i--){
            System.out.print(serie[i] + " ");
        }
    }
    
    public static void verticalInversa(int numeroIngresado){
        System.out.println("fibo<" + numeroIngresado + ">: ");
        for (int i=serie.length-1; i>=0; i--) {
            System.out.println(serie[i] + " ");
        }
    }
}

package ar.edu.untref.dyasc;

public class FibonacciCalculator {

    private int number;
    private int[] series;
    
    public FibonacciCalculator(int number){
        
        this.number = number;
        this.series = fibonacci(number);
    }
    
    private static int[] fibonacci(int number){
        int[] serie = new int[number];
        serie[0]=0;
        serie[1]=1;
        
        for(int i=2; i <=number-1; i++){
            serie[i] = serie[i-1] + serie[i-2];
        }
        return serie;
    }
    
    public int[] getSeries(){
        return this.series;
    }
    
    public int getNumber(){
        return this.number;
    }
}

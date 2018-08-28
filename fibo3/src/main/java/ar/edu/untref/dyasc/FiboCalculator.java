package ar.edu.untref.dyasc;

public class FiboCalculator {

    private int number;
    private int[] serie;
    
    public FiboCalculator(int number){
        
        this.number = number;
        this.serie = fibonacci(number);
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
    
    public int[] getSerie(){
        return this.serie;
    }
    
    public int getNumber(){
        return this.number;
    }
}

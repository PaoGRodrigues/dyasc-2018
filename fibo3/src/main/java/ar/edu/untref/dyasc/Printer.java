package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class Printer {

    private Map<String, Runnable> options;
    private int[] serie;
    
    public Printer(FiboCalculator fibo, Interpreter interpreter){
        System.out.print("fibo<" + fibo.getNumber() + ">: ");
        this.options = new HashMap<String,Runnable>();
        completeOptions();
        this.serie = fibo.getSerie();
    }
    
    private void completeOptions(){
        this.options.put("vd", ()->this.verticalDirecta());
        this.options.put("hi", ()->this.horizontalInversa());
        this.options.put("vi", ()->this.verticalInversa());
    }
    
    private void orientacionDefault(){
        for(int i=0; i<=this.serie.length-1; i++){
            System.out.print(this.serie[i] + " ");
        }
    }
    
    private void verticalDirecta(){
        for (int i=0; i<=this.serie.length-1; i++) {
            System.out.println(this.serie[i] + " ");
        }
    }
    
    private void horizontalInversa(){
        for(int i=this.serie.length-1; i>=0; i--){
            System.out.print(this.serie[i] + " ");
        }
    }
    
    private void verticalInversa(){
        for (int i=this.serie.length-1; i>=0; i--) {
            System.out.println(this.serie[i] + " ");
        }
    }
    
    public void runCommand(String option){
        if(this.options.containsKey(option)){
            this.options.get(option).run();
        }else{
            this.orientacionDefault();
        }
    }
}

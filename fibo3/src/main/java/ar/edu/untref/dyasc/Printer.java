package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class Printer {

    private Map<String, Runnable> options;
    private FiboCalculator fibo;
    private int[] serie;
    
    public Printer(FiboCalculator fibo){
        this.fibo = fibo;
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
        System.out.println();
    }
    
    private void verticalDirecta(){
        System.out.println();
        for (int i=0; i<=this.serie.length-1; i++) {
            System.out.println(this.serie[i] + " ");
        }
    }
    
    private void horizontalInversa(){
        for(int i=this.serie.length-1; i>=0; i--){
            System.out.print(this.serie[i] + " ");
        }
        System.out.println();
    }
    
    private void verticalInversa(){
        System.out.println();
        for (int i=this.serie.length-1; i>=0; i--) {
            System.out.println(this.serie[i] + " ");
        }
    }
    
    public void runCommand(String option){
        if(option!=null){
            if(this.options.containsKey(option)){
                System.out.print("fibo<" + this.fibo.getNumber() + ">: ");
                this.options.get(option).run();
            }else{
                System.out.println("Opciones no válidas.");
            }
        }else{
            System.out.print("fibo<" + this.fibo.getNumber() + ">: ");
            this.orientacionDefault();
        }
    }
}

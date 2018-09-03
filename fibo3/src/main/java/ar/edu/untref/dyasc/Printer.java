package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Printer {

    private Map<String, Runnable> options;
    private FiboCalculator fibo;
    private int[] serie;
    private PrintStream outputFile=null;
    
    public Printer(FiboCalculator fibo, int[] serie){
        this.fibo = fibo;
        this.options = new HashMap<String,Runnable>();
        completeKeys();
        this.serie = serie;
    }
    
    /*Completes the keys only (They are known).*/
    private void completeKeys(){
        this.options.put("vd", null);
        this.options.put("hi", null);
        this.options.put("vi", null);
        this.options.put("hd", null);
    }
    
    /*Completes the options' value with the output on them.*/
    private void completeOptions(PrintStream output){
        this.options.put("vd", ()->this.verticalDirecta(output));
        this.options.put("hi", ()->this.horizontalInversa(output));
        this.options.put("vi", ()->this.verticalInversa(output));
        this.options.put("hd", ()->this.orientacionDefault(output));
    }
    
    private void orientacionDefault(PrintStream output){
        for(int i=0; i<=this.serie.length-1; i++){
           output.print(this.serie[i] + " ");
        }
        output.println();
    }
    
    private void verticalDirecta(PrintStream output){
        output.println();
        for (int i=0; i<=this.serie.length-1; i++) {
            output.println(this.serie[i] + " ");
        }
    }
    
    private void horizontalInversa(PrintStream output){
        for(int i=this.serie.length-1; i>=0; i--){
            output.print(this.serie[i] + " ");
        }
        output.println();
    }
    
    private void verticalInversa(PrintStream output){
        output.println();
        for (int i=this.serie.length-1; i>=0; i--) {
            output.println(this.serie[i] + " ");
        }
    }
    
    private boolean isValidOption(String option){
        return this.options.containsKey(option);
    }
    
    /*Where do we print the output?*/
    private void placePrinter(String file) throws FileNotFoundException{
        if(file!=null){
            this.outputFile = new PrintStream(file);
            System.out.println("fibo<" + this.fibo.getNumber() + "> "+"guardado en "+file);
        }else{
            this.outputFile = System.out;
        }
    }
    
    public void runCommand(String option, String file) throws FileNotFoundException{
        if(option!=null){
            if(isValidOption(option)){
                placePrinter(file);
                completeOptions(this.outputFile);
                this.outputFile.print("fibo<" + this.fibo.getNumber() + ">: ");
                this.options.get(option).run();
            }else{
                System.out.println("Opciones no válidas.");
            }
        }else{
            placePrinter(file);
            completeOptions(this.outputFile);
            this.outputFile.print("fibo<" + this.fibo.getNumber() + ">: ");
            this.orientacionDefault(this.outputFile);
        }
    }
}

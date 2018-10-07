package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Printer {

    private Map<String, Runnable> options;
    private FibonacciCalculator fibo;
    private int[] serie;
    private String file;
    private PrintStream output=null;

    public Printer(FibonacciCalculator fibo, int[] serie, String file){
        this.fibo = fibo;
        this.options = new HashMap<String,Runnable>();
        this.serie = serie;
        this.file = file;
    }

    /*Completes the options' value with the output on them.*/
    private void loadOptionsMap(PrintStream output){
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

    private PrintStream createPrinter() throws FileNotFoundException{
        PrintStream printStream;
        if(this.file!=null){
            FilePrinter filePrinter = new FilePrinter(this.file);
            printStream = filePrinter.createPrintStream(this.fibo.getNumber());
        }else{
            ConsolePrinter consolePrinter = new ConsolePrinter();
            printStream = consolePrinter.createConsolePrinter(this.fibo.getNumber());
        }
        return printStream;
    }

    private String checkNullOption(String option){
        if(option==null){
            option="hd";
        }
        return option;
    }

    public void print(String option) throws FileNotFoundException{
        String newOption = checkNullOption(option);
        this.output = this.createPrinter();
        loadOptionsMap(this.output);
        if(isValidOption(newOption)){
            this.options.get(newOption).run();
        }else{
            System.out.println("Opciones no válidas.");
        }
    }
}

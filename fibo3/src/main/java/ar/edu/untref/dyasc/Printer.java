package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

public class Printer {

    private Map<String, Runnable> options;
    private FibonacciCalculator fibo;
    private int[] series;
    private String file;
    private PrintStream output=null;

    public Printer(FibonacciCalculator fibo, int[] serie, String file){
        this.fibo = fibo;
        this.options = new HashMap<String,Runnable>();
        this.series = serie;
        this.file = file;
    }

    /*Completes the options' value with the output on them.*/
    private void loadOptionsMap(PrintStream output){
        this.options.put("v", ()->printSeries(output, "\n"));
        this.options.put("h", ()->printSeries(output, " "));
    }
    
    private void inverseSeries(){
        int[] temp = new int[this.series.length];
        for(int i=0; i<=this.series.length-1; i++){
            temp[i] = this.series[this.series.length-i-1];
        }
        this.series = temp;
    }
    
    private void printSeries(PrintStream output, String space){
        output.print(space);
        for(int i = 0; i<=series.length-1; i++){
            output.print(series[i] + space);
        }
        output.print(space);
    }
   
    private boolean isValidOption(String option){
        return (option.contains("h")||option.contains("v")) && (option.contains("i")||option.contains("d"));
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

    public void analyzeDirectOrInverse(String param){
        if(param.contains("i")){
            this.inverseSeries();
        }
    }
    
    public String analyzeHorizontalOrVertical(String param){
        String orientation = "";
        if(param.contains("h")){
            orientation = "h";
        }else{
            orientation = "v";
        }
        return orientation;
    }
    
    public void print(String option) throws FileNotFoundException{
        String newOption = this.checkNullOption(option);
        if(isValidOption(newOption)){
            this.output = this.createPrinter();
            loadOptionsMap(this.output);
            analyzeDirectOrInverse(newOption);
            this.options.get(analyzeHorizontalOrVertical(newOption)).run();
        }else{
            System.out.println("Opciones no válidas.");
        }
    }
}

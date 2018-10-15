package ar.edu.untref.dyasc;

public class OutputerFactory {

    public static Outputer createOutputer(String outputerOption, Processor processor){
        Outputer outputer;
        if(outputerOption.equals("")){
            outputer = new ConsoleOutputer(processor);
        }else{
            outputer = new FileOutputer(outputerOption,processor);
        }
        
        return outputer;
    }
}

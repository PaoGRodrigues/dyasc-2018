package ar.edu.untref.dyasc;

public class ProcessorFactory {

    public static Processor createProcessor(String processorOption){
        
        Processor processor;
        if(processorOption.equals("s")){
            processor = new AdderProcessor();
        }else{
            processor = new SeriesProcessor();
        }
        
        return processor;
    }
}

package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileOutputer implements Outputer{
    
    private String file;
    private Processor processor;
    
    public FileOutputer(String file, Processor processor){
        this.file = file;
        this.processor = processor;
    }
    
    @Override
    public void print(String input, int number) {
        System.out.println("fibo<" + number + "> guardado en "+file);
        try{
            PrintStream printer = new PrintStream(this.file);
            printer.print("fibo<" + number + ">" + processor.identifier() + ": " + input);
            printer.close();
        }catch(FileNotFoundException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

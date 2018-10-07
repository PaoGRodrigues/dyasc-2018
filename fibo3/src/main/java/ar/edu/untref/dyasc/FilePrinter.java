package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FilePrinter {

    private String file;
    
    public FilePrinter(String file){
        this.file = file;
    }

    public PrintStream createPrintStream(int number) throws FileNotFoundException{
        System.out.println("fibo<" + number + "> "+"guardado en "+file);
        PrintStream printer = new PrintStream(this.file);
        printer.print("fibo<" + number + ">: ");
        return printer;
    }    
}

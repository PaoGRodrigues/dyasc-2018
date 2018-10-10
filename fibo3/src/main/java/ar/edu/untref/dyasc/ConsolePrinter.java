package ar.edu.untref.dyasc;

import java.io.PrintStream;

public class ConsolePrinter {

    public PrintStream createConsolePrinter(int number){
        System.out.print("fibo<" + number + ">: ");
        return System.out;
    }
    
    
}

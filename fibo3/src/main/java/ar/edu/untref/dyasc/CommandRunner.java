package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;

public class CommandRunner {

    private Interpreter interpreter;
    private FiboCalculator fibo;
    
    public CommandRunner(FiboCalculator fibo, Interpreter interpreter){
        this.fibo= fibo;
        this.interpreter = interpreter;
    }
    
    public void run() throws FileNotFoundException{
        Printer printer = new Printer(this.fibo);
        printer.runCommand(this.interpreter.getParameter("-o"), this.interpreter.getParameter("-f"));
    }
}

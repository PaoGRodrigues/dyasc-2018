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
        
        int[] serie;
        if(this.interpreter.getParameter("-m").equals("s")){
            PlusProcessor plusProc = new PlusProcessor();
            serie = new int[1];
            serie[0] = plusProc.plusSerie(this.fibo.getSerie());
        }else{
            serie = this.fibo.getSerie();
        }
        
        Printer printer = new Printer(this.fibo,serie);
        printer.runCommand(this.interpreter.getParameter("-o"), this.interpreter.getParameter("-f"));
        
    }
}

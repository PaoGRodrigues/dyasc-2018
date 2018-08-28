package ar.edu.untref.dyasc;

public class CommandRunner {

    private Interpreter interpreter;
    private FiboCalculator fibo;
    
    public CommandRunner(FiboCalculator fibo, Interpreter interpreter){
        this.interpreter = interpreter;
    }
    
    public void run(){
        Printer printer = new Printer(this.fibo);
        printer.runCommand(this.interpreter.getParameter("-o"));
        
        
    }
    
}

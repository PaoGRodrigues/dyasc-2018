package ar.edu.untref.dyasc;

public class Main {

    public static void main(String[] args) {

        Interpreter interpreter = new Interpreter(args);
        interpreter.parseArgs();
        
        FiboCalculator fibo = new FiboCalculator(Integer.parseInt(interpreter.getParameter("number")));
        
        Printer printer = new Printer(fibo);
        printer.runCommand(interpreter.getParameter("-o"));
        
        
    }

}

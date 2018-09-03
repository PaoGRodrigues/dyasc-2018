package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Interpreter interpreter = new Interpreter(args);
        interpreter.parseArgs();
        
        FiboCalculator fibo = new FiboCalculator(Integer.parseInt(interpreter.getParameter("number")));
        
        CommandRunner runner = new CommandRunner(fibo, interpreter);
        runner.run();
    }

}

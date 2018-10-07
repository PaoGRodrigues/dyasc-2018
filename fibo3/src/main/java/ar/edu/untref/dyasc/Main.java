package ar.edu.untref.dyasc;

public class Main {

    public static void main(String[] args) throws Exception {

        Interpreter interpreter = new Interpreter(args);
        interpreter.parseArgs();
        
        FibonacciCalculator fibo = new FibonacciCalculator(interpreter.getNumber());
        
        CommandRunner runner = new CommandRunner(fibo, interpreter);
        runner.run();
    }

}

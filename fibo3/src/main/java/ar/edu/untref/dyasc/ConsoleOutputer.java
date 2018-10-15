package ar.edu.untref.dyasc;

public class ConsoleOutputer implements Outputer{

    private Processor processor;
    
    public ConsoleOutputer(Processor processor){
        this.processor = processor;
    }
    
    @Override
    public void print(String input, int number) {
        System.out.print("fibo<" + number + ">" + processor.identifier() + ": ");
        System.out.print(input);
    }
}

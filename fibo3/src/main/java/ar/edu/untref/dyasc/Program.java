package ar.edu.untref.dyasc;

import java.util.List;

public class Program {

    private Processor processor;
    private Order order;
    private OrientationFormatter orientation;
    private Outputer outputer;
    
    public Program(Processor processor, Order order, OrientationFormatter orientation, Outputer outputer){
        this.order = order;
        this.processor = processor;
        this.orientation = orientation;
        this.outputer = outputer;
    }
    
    public void run(int number){
        
        List<Integer> series = FibonacciProcessor.fibonacci(number);
        
        List<Integer> result = processor.process(series);
        List<Integer> orderedResult = order.orderList(result);
        String formatedResult = orientation.formatOutput(orderedResult);
        outputer.print(formatedResult, number);
    }
}

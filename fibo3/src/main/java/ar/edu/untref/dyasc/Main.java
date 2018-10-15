package ar.edu.untref.dyasc;

import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

        try{
            Interpreter interpreter = new Interpreter(args);
            interpreter.parseArgs();
            int number = Integer.parseInt(interpreter.getParameter("number"));
            
            Processor processor = ProcessorFactory.createProcessor(interpreter.getParameter("m"));
            Order order = OrderFactory.createOrder(interpreter.getOrder());
            OrientationFormatter orientation = OrientationFactory.createOrientationFormatter(interpreter.getOrientation());
            Outputer outputer = OutputerFactory.createOutputer(interpreter.getParameter("f"), processor);
            
            Program program = new Program(processor, order, orientation, outputer);
            program.run(number);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }

}

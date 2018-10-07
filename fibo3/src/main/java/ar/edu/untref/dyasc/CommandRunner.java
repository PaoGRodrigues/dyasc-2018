package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class CommandRunner {

    private Interpreter interpreter;
    private FibonacciCalculator fibo;
    private Map<String, Callable<int[]>> modeTypes;
    
    public CommandRunner(FibonacciCalculator fibo, Interpreter interpreter){
        this.fibo= fibo;
        this.interpreter = interpreter;
        this.modeTypes = new HashMap<String, Callable<int[]>>();
        loadModeTypeMap();
    }
    
    public void run() throws Exception{
        
        //If "m" is not in params, use the default mode (list)
        if(this.interpreter.getParameter("m")==null){
            this.interpreter.addParameter("m", "l");
        }
        
        int[] serie = this.modeTypes.get(this.interpreter.getParameter("m")).call();
                
        Printer printer = new Printer(this.fibo, serie, this.interpreter.getParameter("f"));
        printer.print(this.interpreter.getParameter("o"));
        
    }
    
    private void loadModeTypeMap(){
        this.modeTypes.put("l", ()->this.inListMode());
        this.modeTypes.put("s", ()->this.inPlusMode());
    }
    
    private int[] inListMode(){
        return this.fibo.getSeries();
    }
    
    private int[] inPlusMode(){
        PlusProcessor plusProc = new PlusProcessor();
        int[] serie = new int[1];
        serie[0] = plusProc.plusSeries(this.fibo.getSeries());
        
        return serie;
    }
}

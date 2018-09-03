package ar.edu.untref.dyasc;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class CommandRunner {

    private Interpreter interpreter;
    private FiboCalculator fibo;
    private Map<String, int[]> modeType;
    
    public CommandRunner(FiboCalculator fibo, Interpreter interpreter){
        this.fibo= fibo;
        this.interpreter = interpreter;
        this.modeType = new HashMap<String, int[]>();
        completeModeType();
    }
    
    public void run() throws FileNotFoundException{
        
        int[] serie = this.modeType.get(this.interpreter.getParameter("-m"));
                
        Printer printer = new Printer(this.fibo,serie);
        printer.runCommand(this.interpreter.getParameter("-o"), this.interpreter.getParameter("-f"));
        
    }
    
    private void completeModeType(){
        this.modeType.put("l", this.inListMode());
        this.modeType.put(null, this.inListMode());
        this.modeType.put("s", this.inPlusMode());
    }
    
    private int[] inListMode(){
        return this.fibo.getSerie();
    }
    
    private int[] inPlusMode(){
        PlusProcessor plusProc = new PlusProcessor();
        int[] serie = new int[1];
        serie[0] = plusProc.plusSerie(this.fibo.getSerie());
        
        return serie;
    }
}

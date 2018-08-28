package ar.edu.untref.dyasc;

import java.util.HashMap;
import java.util.Map;

public class Interpreter {

    private String[] arguments;
    private Map<String,String> optionMap;
    
    public Interpreter(String[] args){
        
        this.arguments = args;
        this.optionMap = new HashMap<>();
    }
    
    public void parseArgs(){
        
        if(this.arguments.length != 1){
            for(int i=0; i<=this.arguments.length-2; i++){
                String[] splitted = this.arguments[i].split("=");
                this.optionMap.put(splitted[0], splitted[1]);
            }
        }
        this.optionMap.put("number", this.arguments[this.arguments.length-1]);
    }
    
    public String getParameter(String param){
        return this.optionMap.get(param);
    }
}

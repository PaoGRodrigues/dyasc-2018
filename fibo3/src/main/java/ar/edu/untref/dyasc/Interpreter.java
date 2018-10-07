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
        
        if(this.arguments.length > 0){
            for(int i=0; i<=this.arguments.length-2; i++){
                this.parseOption(this.arguments[i]);
            }
        }
        this.addParameter("number", this.arguments[this.arguments.length-1]);
    }
    
    private void parseOption(String option){
        String[] splitted = option.split("=");
        this.addParameter(removeDash(splitted[0]), splitted[1]);
    }
    
    private String removeDash(String param){
        return param.split("-")[1];
    }
    
    public String getParameter(String param){
        return this.optionMap.get(param);
    }
    
    public int getNumber(){
        return Integer.parseInt(this.optionMap.get("number"));
    }
    
    public void addParameter(String param, String value){
        this.optionMap.put(param, value);
    }
}

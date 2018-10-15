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
        String value = this.optionMap.get(param);
        if(value==null){
            value = "";
        } 
        return value;
    }
    
    public int getNumber(){
        return Integer.parseInt(this.optionMap.get("number"));
    }
    
    public void addParameter(String param, String value){
        this.optionMap.put(param, value);
    }
    
    public String getOrientation(){
        String option = this.getParameter("o");
        String orientation=""; 
        if(option.contains("v")){
            orientation = "v";
        }else if(option.equals("") || option.contains("h") ){
            orientation = "h";
        }
        return orientation;
    }
    
    public String getOrder(){
        String option = this.getParameter("o");
        String order = "";
        if(option.contains("i")){
            order= "i";
        }else if(option.contains("d") || option.equals("")){
            order ="d";
        }
        return order;
    }
}

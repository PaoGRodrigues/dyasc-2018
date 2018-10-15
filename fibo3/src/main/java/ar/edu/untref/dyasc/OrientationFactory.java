package ar.edu.untref.dyasc;

public class OrientationFactory {
    
    public static OrientationFormatter createOrientationFormatter(String orientation){
        
        OrientationFormatter formatter; 
        
        if(orientation.equals("v")){
            formatter = new VerticalOrientation();
            
        }else if(orientation.equals("h")){
            formatter = new HorizontalOrientation();
        }else{
            throw new RuntimeException("Opción no válida.");
        }

        return formatter;
    }
}

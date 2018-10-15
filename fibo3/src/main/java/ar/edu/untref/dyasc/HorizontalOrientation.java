package ar.edu.untref.dyasc;

import java.util.List;

public class HorizontalOrientation implements OrientationFormatter{

    @Override
    public String formatOutput(List<Integer> values) {
        String output = "";
        for(Integer value: values){
            output = output.concat(Integer.toString(value) + " ");
        }
        return output;
    }
}

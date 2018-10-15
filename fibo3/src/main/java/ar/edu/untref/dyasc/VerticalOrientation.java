package ar.edu.untref.dyasc;

import java.util.List;

public class VerticalOrientation implements OrientationFormatter{

    @Override
    public String formatOutput(List<Integer> values) {
        String output = "\n";
        for(Integer value: values){
            output = output.concat(Integer.toString(value) + "\n");
        }
        return output;
    }
}

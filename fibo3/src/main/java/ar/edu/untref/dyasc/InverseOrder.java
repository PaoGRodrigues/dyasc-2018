package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.List;

public class InverseOrder implements Order{

    @Override
    public List<Integer> orderList(List<Integer> values) {
        ArrayList<Integer> reversed = new ArrayList<Integer>();
        
        for(int i = values.size()-1; i>=0; i--){
            reversed.add(values.get(i));
        }
        
        return reversed;
    }    
}

package ar.edu.untref.dyasc;

import java.util.LinkedList;
import java.util.List;

public class AdderProcessor implements Processor{

    @Override
    public List<Integer> process(List<Integer> values) {
        int result = 0;
        for(Integer value: values){
            result += value;
        }
        
        List<Integer> list = new LinkedList<Integer>();
        list.add(result);
        
        return list;
    }

    @Override
    public String identifier() {
        return "s";
    }
}

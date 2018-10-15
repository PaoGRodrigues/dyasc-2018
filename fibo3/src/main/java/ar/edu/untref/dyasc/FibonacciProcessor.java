package ar.edu.untref.dyasc;

import java.util.ArrayList;
import java.util.List;

public class FibonacciProcessor {
    
    public static List<Integer> fibonacci(int number){
        ArrayList<Integer> series = new ArrayList<Integer>();
        series.add(0, 0);
        series.add(1, 1);
        for(int i=2; i <=number-1; i++){
            series.add(i, series.get(i-1) + series.get(i-2));
        }
        return series;
    }
}

package ar.edu.untref.dyasc;

public class PlusProcessor {

    public int plusSeries(int[] series){
        int result = 0;
        for(int i=0; i<series.length; i++){
            result+=series[i];
        }
        return result;
    }
}

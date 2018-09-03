package ar.edu.untref.dyasc;

public class PlusProcessor {

    public int plusSerie(int[] serie){
        int result = 0;
        for(int i=0; i<serie.length-1; i++){
            result+=serie[i];
        }
        return result;
    }
}

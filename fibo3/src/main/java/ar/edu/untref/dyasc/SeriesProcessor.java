package ar.edu.untref.dyasc;

import java.util.List;

public class SeriesProcessor implements Processor{

    @Override
    public List<Integer> process(List<Integer> values) {

        return values;
    }

    @Override
    public String identifier() {
        return "";
    }
}

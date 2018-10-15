package ar.edu.untref.dyasc;

import java.util.List;

public interface Processor {

    public abstract List<Integer> process(List<Integer> values);
    public abstract String identifier();
}

package ar.edu.untref.dyasc;

import java.util.List;

public class DirectOrder implements Order{

    @Override
    public List<Integer> orderList(List<Integer> values) {
        return values;
    }
}

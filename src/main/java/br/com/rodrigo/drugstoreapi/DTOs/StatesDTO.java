package br.com.rodrigo.drugstoreapi.DTOs;

import br.com.rodrigo.drugstoreapi.models.State;
import java.io.Serializable;
import java.util.List;

public class StatesDTO implements Serializable {

    private static final long serialVersionUID = -2715662817024397579L;

    private String name;

    private List<State> states;

    public String getName() {
        return name;
    }

    public List<State> getStates() {
        return states;
    }

    public void setStates(List<State> states) {
        this.states = states;
    }
}

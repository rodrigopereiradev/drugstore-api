package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.State;
import br.com.rodrigo.drugstoreapi.models.mocks.StateMock;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    public Set<State> retrieveAllStates() {
        return new StateMock().getStates();
    }
}

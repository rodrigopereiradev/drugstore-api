package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.State;
import br.com.rodrigo.drugstoreapi.models.mocks.StateMock;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    public List<State> retrieveAllStates() {
        return new StateMock().getStates();
    }
}

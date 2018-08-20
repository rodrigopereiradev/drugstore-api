package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.State;
import br.com.rodrigo.drugstoreapi.repositories.StateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StateService {

    private final StateRepository stateRepository;

    @Autowired
    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public List<State> retrieveAllStates() {
        return this.stateRepository.findAll();
    }

}

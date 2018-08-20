package br.com.rodrigo.drugstoreapi.resources;

import br.com.rodrigo.drugstoreapi.DTOs.StatesDTO;
import br.com.rodrigo.drugstoreapi.models.State;
import br.com.rodrigo.drugstoreapi.services.StateService;
import java.io.Serializable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/drugstore_api")
public class StateResource implements Serializable {

    private static final long serialVersionUID = 4760840579515435394L;

    private final StateService stateService;

    @Autowired
    public StateResource(StateService stateService) {
        this.stateService = stateService;
    }

    @GetMapping(value = "/states")
    public ResponseEntity<List<State>> retrieveAllStates() {
        List<State> states = this.stateService.retrieveAllStates();
        return new ResponseEntity<>(states, HttpStatus.OK);
    }

}

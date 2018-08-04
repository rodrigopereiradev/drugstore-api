package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.State;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static java.lang.System.out;

@SpringBootTest
@RunWith(SpringRunner.class)
public class StateServiceTest {

    @Autowired
    private StateService stateService;

    @Test
    public void retrieveAll27States() {
        List<State> states = stateService.retrieveAllStates();
        Assert.assertEquals(27, states.size());
    }

}

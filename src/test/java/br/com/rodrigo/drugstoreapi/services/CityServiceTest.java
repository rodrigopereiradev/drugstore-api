package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.City;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CityServiceTest {

    @Autowired
    private CityService cityService;

    @Test
    public void findCitiesWithRightState() {

        List<City> cities = cityService.findCitiesByState("MG");

        Assert.assertNotNull(cities);
    }

    @Test
    public void findCitiesWithStateThatNotExist() {
        List<City> cities = cityService.findCitiesByState("ZZ");

        Assert.assertTrue(cities.isEmpty());
    }
}

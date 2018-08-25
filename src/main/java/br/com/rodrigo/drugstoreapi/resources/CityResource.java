package br.com.rodrigo.drugstoreapi.resources;

import br.com.rodrigo.drugstoreapi.models.City;
import br.com.rodrigo.drugstoreapi.services.CityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/drugstore_api")
public class CityResource {

    private final CityService cityService;

    @Autowired
    public CityResource(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping(value = "/{state}/cities")
    public ResponseEntity<List<City>> retrieveCitiesByState(@PathVariable("state") String state) {
        if (state == null || state.length() != 2)
            throw new IllegalArgumentException("Estado null ou em formato inválido!");
        List<City> cities = this.cityService.findCitiesByState(state);
        return new ResponseEntity<>(cities, HttpStatus.OK);
    }

}

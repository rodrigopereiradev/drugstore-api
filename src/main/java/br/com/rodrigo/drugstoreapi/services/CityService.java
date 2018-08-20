package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.City;
import br.com.rodrigo.drugstoreapi.repositories.CityRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    private final CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }


    public List<City> findCitiesByState(String state) { return  cityRepository.findCitiesByState(state); }

}

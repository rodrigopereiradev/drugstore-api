package br.com.rodrigo.drugstoreapi.repositories;

import br.com.rodrigo.drugstoreapi.models.City;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CityRepository extends JpaRepository<City, Long> {

    @Query(value = "SELECT M.id, M.NO_MUNICIPIO_SIACI FROM municipio M WHERE SG_UF = ?1", nativeQuery = true)
    List<City> findCitiesByState(String state);

    City findByName(String name);

}

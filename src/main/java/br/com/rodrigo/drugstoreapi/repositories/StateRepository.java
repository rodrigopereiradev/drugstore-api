package br.com.rodrigo.drugstoreapi.repositories;

import br.com.rodrigo.drugstoreapi.models.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long>{
}

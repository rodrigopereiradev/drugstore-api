package br.com.rodrigo.drugstoreapi.repositories;

import br.com.rodrigo.drugstoreapi.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    public void deleteByUsername(String username);
}

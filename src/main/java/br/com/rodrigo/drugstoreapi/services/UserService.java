package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.User;
import br.com.rodrigo.drugstoreapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(User user) {
        return this.userRepository.save(user);
    }

    @Transactional
    public void deleteByUsername(String username) {
        userRepository.deleteByUsername(username);
    }
}

package br.com.rodrigo.drugstoreapi.resources;

import br.com.rodrigo.drugstoreapi.models.User;
import br.com.rodrigo.drugstoreapi.services.UserService;
import java.rmi.NoSuchObjectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/drugstore_api")
public class UserResource {

    private final UserService userService;

    @Autowired
    public UserResource(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<User> createNewUser(@RequestBody User user) {
        User userSaved = this.userService.save(user);
        return new ResponseEntity<>(userSaved, HttpStatus.OK);
    }

    @PutMapping("/user")
    public ResponseEntity<User> updateUser(@RequestBody User user) throws NoSuchObjectException {
        User userUpdated = this.userService.update(user);
        return  new ResponseEntity<>(userUpdated, HttpStatus.OK);
    }
}

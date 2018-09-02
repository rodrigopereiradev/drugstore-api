package br.com.rodrigo.drugstoreapi.services;

import br.com.rodrigo.drugstoreapi.models.*;
import br.com.rodrigo.drugstoreapi.models.enums.Gender;
import br.com.rodrigo.drugstoreapi.models.enums.PhoneType;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private CityService cityService;

    @Autowired
    private StateService stateService;

    @Test
    public void save() {
        User user = new User(null, "rodrigo.pereira", "senhaSemCriptografia", true,
                null, null, this.returnPersonToTest());

        user = this.userService.save(user);

        Assert.assertNotNull(user.getId());
    }

    @After
    public void deleteUserSavedOnTest() {
        this.userService.deleteByUsername("rodrigo.pereira");
    }

    public Person returnPersonToTest() {
        return new Person(null, "Rodrigo da Silva Pereira", "00457018143", Gender.MALE,
                returnBirthDateToTest(), returnAddressToTest(), returnEmailToTest(), returnPhonesToTest());
    }

    public LocalDate returnBirthDateToTest() {
        return LocalDate.of(1983,11,11);
    }

    public Address returnAddressToTest() {
        return new Address(null,"Qnp 32 Conjunto T", "16-A", "P.Sul", "Ceiândia","72236220",
                this.returnCityToTest(), this.returnStateToTest());
    }

    public Email returnEmailToTest() {
        return new Email(null, "rodrigopereira.dev@gmail.com");
    }


    public List<Phone> returnPhonesToTest() {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone(null, "6130221106", PhoneType.PHONE));
        phones.add(new Phone(null, "61981605704", PhoneType.CELLPHONE));
        return phones;
    }


    public City returnCityToTest() {
        return this.cityService.findCityByName("Brasília");
    }


    public State returnStateToTest() {
        return this.stateService.retrieveStateByInitials("DF");
    }
}

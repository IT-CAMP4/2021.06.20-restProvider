package pl.camp.it.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.camp.it.model.Address;
import pl.camp.it.model.User;

@RestController
public class SimpleRestController {

    @RequestMapping(value = "/rest1", method = RequestMethod.GET)
    public User getUser() {
        Address address = new Address("Ogrodowa", "Kraków", "5/3", "31-345");

        User user = new User(1, "janusz", "DS432534DSF4435SDFG", address);

        return user;
    }
}

package pl.camp.it.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping(value = "/rest2/{parametr}/{parametr2}", method = RequestMethod.POST)
    public User modifyUser(@RequestBody User user,
                           @RequestHeader("jakis-header") String header,
                           @RequestHeader("jakis-naglowek") int header2,
                           @PathVariable String parametr,
                           @PathVariable String parametr2,
                           @RequestParam String wiek,
                           @RequestParam int ilosc) {
        System.out.println(user);
        System.out.println(header);
        System.out.println(header2);
        System.out.println(parametr);
        System.out.println(parametr2);
        System.out.println(wiek);
        System.out.println(ilosc);

        user.setId(100);

        return user;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public ResponseEntity<User> test() {
        ResponseEntity<User> odpowiedz = ResponseEntity
                .status(409)
                .header("naglowek", "abcd")
                .header("jakis-header", "wartosc")
                .body(new User());

        return odpowiedz;
    }
}

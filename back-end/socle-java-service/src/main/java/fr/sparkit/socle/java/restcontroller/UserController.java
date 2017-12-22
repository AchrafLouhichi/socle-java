package fr.sparkit.socle.java.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sparkit.socle.java.entities.User;
import fr.sparkit.socle.java.service.IUserService;

@RestController
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
	return userService.findAll();
    }
}
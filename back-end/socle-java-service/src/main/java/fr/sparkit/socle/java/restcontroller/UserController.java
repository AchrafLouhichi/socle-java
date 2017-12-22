package fr.sparkit.socle.java.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.sparkit.socle.java.entities.User;

@RestController
public class UserController {

    // @Autowired
    // private IUserService userService;

    @GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getAll() {
	List<User> list = new ArrayList<>();
	list.add(new User((long) 1, "test", "test2", "test3", "test", "role"));
	return list;
    }
}
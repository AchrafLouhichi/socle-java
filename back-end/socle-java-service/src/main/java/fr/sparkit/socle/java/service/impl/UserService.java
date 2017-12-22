package fr.sparkit.socle.java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.sparkit.socle.java.dao.UserDao;
import fr.sparkit.socle.java.entities.User;
import fr.sparkit.socle.java.service.IUserService;

@Service
public class UserService extends GenericService<User, Integer> implements IUserService {

    @Autowired
    private UserDao userDao;

    public UserService() {
	super();
    }

    @Override
    public List<User> findByFirstName(String firstname) {
	return userDao.findByFirstName(firstname);
    }

    @Override
    public List<User> findById(Long id) {
	return userDao.findById(id);
    }

    @Override
    public List<User> findByLastName(String lastname) {
	return userDao.findByLastName(lastname);
    }

}

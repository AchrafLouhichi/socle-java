package fr.sparkit.socle.java.service;

import java.util.List;

import fr.sparkit.socle.java.entities.User;

public interface IUserService extends IGenericService<User, Integer> {

    List<User> findByFirstname(String firstname);

    List<User> findById(Long id);

    List<User> findByLastName(String lastname);
}
package fr.sparkit.socle.java.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import fr.sparkit.socle.java.entities.User;

@Transactional
public interface IUserService extends IGenericService<User, Integer> {

    List<User> findByFirstName(String firstname);

    List<User> findById(Long id);

    List<User> findByLastName(String lastname);
}
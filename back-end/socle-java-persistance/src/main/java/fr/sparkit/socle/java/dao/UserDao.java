package fr.sparkit.socle.java.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.sparkit.socle.java.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

    List<User> findByFirstname(String firstname);

    List<User> findById(Long id);

    List<User> findByLastName(String lastname);
}

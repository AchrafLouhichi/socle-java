package fr.sparkit.socle.java.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, unique = true)
    String firstName;

    @Column(unique = true)
    String lastName;

    @Column(nullable = false, unique = true)
    String login;
    @Column(nullable = false)
    String password;

    @Column(nullable = false)
    String role;

    public User(Long id, String firstName, String lastName, String login, String password, String role) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.login = login;
	this.password = password;
	this.role = role;
    }

    public User() {

    }

    public Long getId() {

	return id;
    }

    public void setId(Long id) {

	this.id = id;
    }

    public String getFirstname() {
	return firstName;
    }

    public void setFirstname(String firstname) {
	this.firstName = firstname;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getLogin() {
	return login;
    }

    public void setLogin(String login) {
	this.login = login;
    }

    public String getPassword() {
	return password;
    }

    public void setPassword(String password) {
	this.password = password;
    }

    public String getRole() {
	return role;
    }

    public void setRole(String role) {
	this.role = role;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	User other = (User) obj;
	if (id == null) {
	    if (other.id != null)
		return false;
	} else if (!id.equals(other.id))
	    return false;
	return true;
    }

    @Override
    public String toString() {
	StringBuilder builder = new StringBuilder();
	builder.append("User [id=").append(id).append(", firstname=").append(firstName).append(", lastname=").append(lastName).append(", login=").append(login)
		.append(", password=").append(password).append(", role=").append(role).append("]");
	return builder.toString();
    }

}

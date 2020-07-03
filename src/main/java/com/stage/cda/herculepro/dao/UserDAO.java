package com.stage.cda.herculepro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.User;

@Repository(value="userDAO")
public interface UserDAO extends JpaRepository<User, Integer> {

	User findOneByPseudo(String pseudo);
	
//	@Query(" select u from User u where u.username = ?1")
//	Optional<User> findUserWithName(String username);
}

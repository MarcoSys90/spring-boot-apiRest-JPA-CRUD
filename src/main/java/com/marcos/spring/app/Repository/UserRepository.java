package com.marcos.spring.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marcos.spring.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	
}

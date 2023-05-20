package com.codewithfahmi.fullstackbackend.repository;

import com.codewithfahmi.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

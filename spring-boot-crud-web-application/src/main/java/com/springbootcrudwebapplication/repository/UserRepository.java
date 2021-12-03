package com.springbootcrudwebapplication.repository;

import com.springbootcrudwebapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}

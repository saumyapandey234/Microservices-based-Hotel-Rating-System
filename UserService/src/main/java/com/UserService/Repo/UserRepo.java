package com.UserService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<com.UserService.entities.User, Integer> {
  //if uou want to implement any custom method then you can declare here
  //for example

}

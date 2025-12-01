package com.UserService.services;

import java.util.List;

import com.UserService.entities.User;

public interface UserService {

  // user operations

  // create
  User saveUser(User user);

  // get single user of given id
  User getUserById(int userId);

  // get all users
  List<User> getAllUsers();

  // delete user
  void deleteUser(int userId);

  // update user
  User updateUser(User user, int userId);

}

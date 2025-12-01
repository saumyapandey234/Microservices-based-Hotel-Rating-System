package com.UserService.Exceptions;

public class ResourceNotFoundExceptions extends RuntimeException {

  // default constructor
  public ResourceNotFoundExceptions() {
    super("Resource not found on server");
  }

  // parameterized constructor
  public ResourceNotFoundExceptions(String message) {
    super("Resource not found with message: " + message);
  }

}

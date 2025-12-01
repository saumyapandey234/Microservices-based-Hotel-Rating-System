package com.UserService.Exceptions;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.UserService.Payload.ApiResponse;

@RestControllerAdvice
// exception within the whole project get handles through restcotyrolleradvice
// means through this class or this file(centralised exception handler)
public class GlobalExceptions {

  @ExceptionHandler(ResourceNotFoundExceptions.class)
  public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourceNotFoundExceptions ex) {
    String message = ex.getMessage();

    ApiResponse apiResponse = ApiResponse.builder().message(message).success(true)
        .status(org.springframework.http.HttpStatus.NOT_FOUND)
        .build();

    return new ResponseEntity<ApiResponse>(apiResponse, org.springframework.http.HttpStatus.NOT_FOUND);

  }
}

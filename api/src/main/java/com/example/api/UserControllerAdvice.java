package com.example.api;


import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@RestControllerAdvice
public class UserControllerAdvice {

    @ExceptionHandler(NoResourceFoundException.class)
    public ResponseEntity<ErrorResponse> case03(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("Path invalid");
        ResponseEntity<ErrorResponse> response
                = new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(404));
        return response;
    }

    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<ErrorResponse> case01(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage("Input Invalid");
        ResponseEntity<ErrorResponse> response
                = new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(400));
        return response;
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<ErrorResponse> case02(Exception e) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setMessage(e.getMessage());
        ResponseEntity<ErrorResponse> response
                = new ResponseEntity<>(errorResponse, HttpStatusCode.valueOf(404));
        return response;
    }

}

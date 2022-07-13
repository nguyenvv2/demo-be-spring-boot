package edu.poly.test_qlda.infrastructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestApiExceptionHandler {

    @ExceptionHandler(ApiException.class)
    public ResponseEntity<?> handlerException(ApiException apiException) {
        Error apiError = new Error(apiException.getMessage());
        return new ResponseEntity<>(apiError, HttpStatus.BAD_REQUEST);
    }

}

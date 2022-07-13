package edu.poly.test_qlda.infrastructure.exception;

import org.springframework.stereotype.Component;

@Component
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String message;

    public ApiException() {
    }

    public ApiException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}

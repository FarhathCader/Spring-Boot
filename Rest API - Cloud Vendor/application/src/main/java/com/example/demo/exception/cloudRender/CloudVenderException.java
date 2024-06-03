package com.example.demo.exception.cloudRender;

import org.springframework.http.HttpStatus;

public class CloudVenderException {
    private String message;
    private Throwable throwable;
    private HttpStatus httpStatus;

    public CloudVenderException(String message, Throwable throwable, HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        this.httpStatus = httpStatus;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

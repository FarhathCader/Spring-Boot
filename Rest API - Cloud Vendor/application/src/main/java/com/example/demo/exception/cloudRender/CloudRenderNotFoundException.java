package com.example.demo.exception.cloudRender;

public class CloudRenderNotFoundException extends RuntimeException{

    public CloudRenderNotFoundException(String message) {
        super(message);
    }

    public CloudRenderNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}

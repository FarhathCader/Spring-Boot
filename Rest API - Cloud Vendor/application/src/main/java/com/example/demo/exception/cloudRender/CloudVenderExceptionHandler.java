package com.example.demo.exception.cloudRender;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CloudVenderExceptionHandler {

    @ExceptionHandler(value = {CloudRenderNotFoundException.class})
    public ResponseEntity <Object> handlerVenderNotFoundException
            (CloudRenderNotFoundException cloudRenderNotFoundException){

        CloudVenderException cloudVenderException = new CloudVenderException(
                cloudRenderNotFoundException.getMessage(),
                cloudRenderNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVenderException,HttpStatus.NOT_FOUND);


    }
}

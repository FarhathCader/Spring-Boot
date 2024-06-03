package com.example.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ResponseHandler {

    public static ResponseEntity<Object> responseBuilder(
            String message,
            Object responseBody,
            HttpStatus httpStatus
    ){
        Map<String,Object> response = new HashMap<>();
        response.put("message",message);
        response.put("data",responseBody);
        response.put("httpStatus",httpStatus);

        return new ResponseEntity<>(response,httpStatus);
    }

}

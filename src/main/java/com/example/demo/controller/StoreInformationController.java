package com.example.demo.controller;


import com.example.demo.repository.StoreInformationRepo;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.StoreInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/storeinformation")
public class StoreInformationController {


    @Autowired
    private StoreInformationService storeInformationService;





    @GetMapping
    public ResponseEntity<Object> getStoreInformations() {
        return storeInformationService.getStoreInformations();
    }

    @GetMapping("{storeId}")
    public ResponseEntity<Object> getStoreInformation(@PathVariable int storeId) {
        return storeInformationService.getStoreInformation(storeId);
    }


}

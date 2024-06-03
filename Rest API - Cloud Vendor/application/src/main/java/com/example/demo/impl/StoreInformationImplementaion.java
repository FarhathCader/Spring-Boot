package com.example.demo.impl;

import com.example.demo.model.StoreInformation;
import com.example.demo.repository.StoreInformationRepo;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.StoreInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class StoreInformationImplementaion implements StoreInformationService {


    @Autowired
    private StoreInformationRepo storeInformationRepo;
    public ResponseEntity<Object> getStoreInformation(int storeId) {

        System.out.println(storeId);
        Optional<StoreInformation> storeInformation = storeInformationRepo.findById(storeId);
        if(storeInformation.isPresent()){
            return ResponseHandler.responseBuilder("Success",storeInformation.get(), HttpStatus.OK);
        }else{
            return ResponseHandler.responseBuilder("Store Information Not found",null, HttpStatus.NOT_FOUND);
        }

    }

    public ResponseEntity<Object> updateStoreInformation(int storeId, StoreInformation storeInformation) {
        return null;
    }

    public ResponseEntity<Object> createStoreInformation(StoreInformation storeInformation) {
        return null;
    }

    public ResponseEntity<Object> deleteStoreInformation(int storeId) {
        return null;
    }

    public ResponseEntity<Object> getStoreInformations() {
        return storeInformationRepo.findAll().isEmpty() ?
                ResponseHandler.responseBuilder("No Store Information found",null, HttpStatus.NOT_FOUND)
                : ResponseHandler.responseBuilder("Success",storeInformationRepo.findAll(), HttpStatus.OK);
    }
}

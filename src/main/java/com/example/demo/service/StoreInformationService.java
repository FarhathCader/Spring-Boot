package com.example.demo.service;

import com.example.demo.model.StoreInformation;
import org.springframework.http.ResponseEntity;

public interface StoreInformationService {

    public ResponseEntity<Object> getStoreInformation(int storeId);

    public ResponseEntity<Object> updateStoreInformation(int storeId, StoreInformation storeInformation);

    public ResponseEntity<Object> createStoreInformation(StoreInformation storeInformation);

    public ResponseEntity<Object> deleteStoreInformation(int storeId);

    public ResponseEntity<Object> getStoreInformations();


}

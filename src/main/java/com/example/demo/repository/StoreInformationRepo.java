package com.example.demo.repository;

import com.example.demo.model.StoreInformation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StoreInformationRepo extends JpaRepository<StoreInformation, Integer> {

    List<StoreInformation> findByStoreName(String storeName);

}

package com.example.demo.service;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.model.CloudVender;

import java.util.List;

import com.example.demo.model.CloudVender;

public interface CloudVendorService {


    public ResponseEntity<Object> getCloudVendor(String  vendorId) ;



    public CloudVender updateCloudVendor(String vendorId,CloudVender cloudVender) ;

    public String createCloudVendor(CloudVender cloudVender);

    public List<CloudVender> getCloudVendor();

    public String deleteCloudVendor(String vendorId);
}

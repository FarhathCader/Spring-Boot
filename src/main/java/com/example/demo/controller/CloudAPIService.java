package com.example.demo.controller;


import com.example.demo.service.CloudVendorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.CloudVender;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {


    CloudVendorService cloudVendorService;

    public CloudAPIService(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("{vendorId}")
    public ResponseEntity<Object> getCloudVendor(@PathVariable String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }


    @PutMapping("{vendorId}")
    public CloudVender updateCloudVendor(@PathVariable String vendorId, @RequestBody CloudVender cloudVender) {
        return cloudVendorService.updateCloudVendor(vendorId,cloudVender);
    }

    @GetMapping
    public List<CloudVender> getCloudVendor() {
        return cloudVendorService.getCloudVendor();
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVender(@PathVariable String vendorId){
        return cloudVendorService.deleteCloudVendor(vendorId);
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVender cloudVender) {
       return cloudVendorService.createCloudVendor(cloudVender);
    }

}

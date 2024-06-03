package com.example.demo.impl;

import com.example.demo.exception.cloudRender.CloudRenderNotFoundException;
import com.example.demo.repository.CloudVendorRepository;
import com.example.demo.response.ResponseHandler;
import com.example.demo.service.CloudVendorService;
import com.example.demo.model.CloudVender;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CloudVenderImpl implements CloudVendorService {

    CloudVendorRepository cloudVendorRepository ;

    public CloudVenderImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }



    @Override
    public ResponseEntity<Object> getCloudVendor(String vendorId) {
        try {
            System.out.println(vendorId);
            Optional<CloudVender> cloudVender = cloudVendorRepository.findById(Long.parseLong(vendorId));
            if(cloudVender.isPresent()){
                return ResponseHandler.responseBuilder("Success",cloudVender.get(),HttpStatus.OK);
            }else{
               return ResponseHandler.responseBuilder("Cloud Vendor Not found",null,HttpStatus.NOT_FOUND);
            }
        } catch (NumberFormatException e) {
            return ResponseHandler.responseBuilder(e.getMessage(),null,HttpStatus.FORBIDDEN);
        }


    }



    @Override
    public CloudVender updateCloudVendor(String vendorId, CloudVender cloudVendor) {
        try {
            long id = Long.parseLong(vendorId);
            Optional<CloudVender> existingVendor = cloudVendorRepository.findById(id);
            if (existingVendor.isPresent()) {
                CloudVender updatedVendor = existingVendor.get();
                updatedVendor.setVendorAddress(cloudVendor.getVendorAddress());
                updatedVendor.setVendorName(cloudVendor.getVendorName());
                updatedVendor.setVendorPhone(cloudVendor.getVendorPhone());
                // set other fields as needed
                return cloudVendorRepository.save(updatedVendor);
            } else {
                throw new CloudRenderNotFoundException("Cloud Vendor Not found");
            }
        } catch (NumberFormatException e) {
            throw new CloudRenderNotFoundException("Invalid Vendor ID format", e);
        }
    }


    @Override
    public String createCloudVendor(CloudVender cloudVender) {
        cloudVendorRepository.save(cloudVender);
        return "Success";
    }

    @Override
    public List<CloudVender> getCloudVendor() {
        if(cloudVendorRepository != null){
            return cloudVendorRepository.findAll();
        }
        return null;
    }

    @Override
    public String deleteCloudVendor(String vendorId) {
        if(cloudVendorRepository != null)
        cloudVendorRepository.deleteById(Long.parseLong(vendorId));

        return "Deletion succesfully";
    }
}

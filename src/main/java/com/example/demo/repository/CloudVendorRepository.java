package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.CloudVender;
public interface CloudVendorRepository extends JpaRepository <CloudVender, Long> {
}

package com.example.demo.service;

import com.example.demo.model.Package;
import com.example.demo.repository.PackageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PackageService {
    
    @Autowired
    private PackageRepository packageRepository;

    public List<Package> findAll() {
        return packageRepository.findAll();
    }

    public Optional<Package> findById(int id) {
        return packageRepository.findById(id);
    }

    public Package savePackage(Package package1) {
        return packageRepository.save(package1);
    }

    public Package updatePackage(int id, Package package1) {
        Package updatedPackage = packageRepository.findById(id).orElse(null);
        //updatedTourRide.setName(tourRide.getName());
        //updatedTourRide.setEmail(tourRide.getEmail());
        //updatedTourRide.setCountry(tourRide.getCountry());
        return packageRepository.save(updatedPackage);
    }

    public void deleteById(int id) {
        packageRepository.deleteById(id);
    }

}

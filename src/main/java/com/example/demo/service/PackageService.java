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
        updatedPackage.setName(package1.getName());
        updatedPackage.setDescription(package1.getDescription());
        updatedPackage.setPrice(package1.getPrice());
        updatedPackage.setStart_date(package1.getStart_date());
        updatedPackage.setEnd_date(package1.getEnd_date());
        updatedPackage.setStart_location(package1.getStart_location());
        updatedPackage.setEnd_location(package1.getEnd_location());
        updatedPackage.setNumber_of_nights(package1.getNumber_of_nights());
        updatedPackage.setNumber_of_days(package1.getNumber_of_days());
        updatedPackage.setNotes(package1.getNotes());
        return packageRepository.save(updatedPackage);
    }

    public void deleteById(int id) {
        packageRepository.deleteById(id);
    }

}

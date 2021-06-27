package com.example.demo.repository;
import com.example.demo.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Integer> {
   
        // SELECT * FROM activity
        List<Activity> findAll();
}

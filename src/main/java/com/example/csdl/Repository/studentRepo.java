package com.example.csdl.Repository;


import com.example.csdl.Entity.student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepo extends JpaRepository<student, Integer> {
    @Query(value = "SELECT * FROM student ", nativeQuery = true)
    public List<student> getAllStudent();
}

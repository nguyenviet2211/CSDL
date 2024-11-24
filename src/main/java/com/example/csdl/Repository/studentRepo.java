package com.example.csdl.Repository;


import com.example.csdl.Entity.hocsinh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentRepo extends JpaRepository<hocsinh, Integer> {
    @Query(value = "SELECT * FROM hocsinh", nativeQuery = true)
    public List<hocsinh> getAllHocsinh();
}

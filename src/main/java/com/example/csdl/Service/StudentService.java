package com.example.csdl.Service;


import com.example.csdl.Entity.hocsinh;
import com.example.csdl.Repository.studentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    private studentRepo SRepo;

    public List<Map<String, Object>> getAllHocSinh() {
        List<hocsinh> list = SRepo.getAllHocsinh();
        List<Map<String, Object>> listMap = new ArrayList<>();
        
        list.forEach(student -> {
            Map<String, Object> row = new HashMap<>();
            row.put("id", student.getMaHS());
            row.put("name", student.getTen());
            row.put("ngay_sinh", student.getNgaySinh());
            row.put("age", student.getTuoi());
            row.put("address", student.getDiaChi());
            row.put("class", student.getLop());
            row.put("sex", student.getGioiTinh());
            row.put("schoolId", student.getMaTruong());
            row.put("coachId", student.getMaHLV());
            listMap.add(row);
        });
        return listMap;
    }
}

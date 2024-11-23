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

    public List<Map<String, Object>> getAllStudent() {
        List<hocsinh> list = SRepo.getAllStudent();
        List<Map<String, Object>> listMap = new ArrayList<>();
        list.forEach(student -> {
            Map<String, Object> row = new HashMap<>();
            row.put("id", student.getID());
            row.put("name", student.getNAME());
            row.put("ngay_sinh", student.getDateOfBirth());
            row.put("age", student.getAge());
            row.put("sdt", student.getPHONE_NUMBER());
            row.put("address", student.getAddress());
            row.put("class", student.getCLASS());
            row.put("sex", student.getSex());
            row.put("schoolId", student.getSCHOOL_ID());
            row.put("coachId", student.getCOACH_ID());
            listMap.add(row);
        });
        return listMap;
    }
}

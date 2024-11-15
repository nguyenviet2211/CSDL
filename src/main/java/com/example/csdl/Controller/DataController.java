package com.example.csdl.Controller;

import com.example.csdl.Service.StudentService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DataController {
    @Autowired
    private StudentService studentService;
    private List<Map<String, Object>> dataList;

    @PostConstruct
    public void initData() {
        dataList = studentService.getAllStudent();
    }

    // GET: Lấy hết dữ liệu hiện len front
    @GetMapping("/List")
    public List<Map<String, Object>> getData() {
        return dataList;
    }

    // POST: Thêm bản ghi mới
    @PostMapping("/List")
    public void addData(@RequestBody Map<String, Object> newData) {
        int newId = dataList.size() + 1;
        newData.put("id", newId);
        dataList.add(newData);
//        return newData; // Return the newly added record
    }


    // Lấy dữ liêu ban ghi
    @GetMapping("/List/{id}")
    public Map<String, Object> getUserById(@PathVariable String id) {
        // Tìm kiếm trong dataList theo id
        for (Map<String, Object> record : dataList) {
            if (record.get("id").equals(id)) {
                return record;  // Trả về bản ghi nếu tìm thấy
            }
        }
        throw new RuntimeException("Record not found");  // Nếu không tìm thấy
    }

    // PUT: Cập nhât giá trị bản ghi
    @PutMapping("/List/{id}")
    public Map<String, Object> updateData(@PathVariable String id, @RequestBody Map<String, Object> updatedData) {
        for (Map<String, Object> record : dataList) {
            if (record.get("id").equals(id)) {
                // Cập nhật thông tin người dùng với dữ liệu mới
                record.putAll(updatedData);  // Cập nhật tất cả các trường trong record
                record.put("id", id);        // Đảm bảo ID không bị thay đổi
                return record;               // Trả về bản ghi đã được cập nhật
            }
        }
        throw new RuntimeException("Record not found");
    }


    // DELETE: Xóa bản ghi
    @DeleteMapping("/List/{id}")
    public String deleteData(@PathVariable String id) {
        for (Map<String, Object> record : dataList) {
            if (record.get("id").equals(id)) {
                dataList.remove(record);
                return "Record deleted successfully";
            }
        }
        throw new RuntimeException("Record not found");
    }
}

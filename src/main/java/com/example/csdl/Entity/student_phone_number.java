package com.example.csdl.Entity;

import com.example.csdl.Entity.CompositeId.ID_STUDENT;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="student_phone_number")
@IdClass(hs_sdt.class)
public class student_phone_number {
    @Id
    private String studentID;

    @Id
    private String phoneNumber;
}

package com.example.csdl.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="hocsinh")
public class hocsinh extends SuperClass{

    @Column(name="NgaySinh")
    private String dateOfBirth;

    @Column(name="Tuoi")
    private int age;

    @Column(name="DiaChi")
    private String address;

    @Column(name="Lop")
    private String CLASS;

    @Column(name="GioiTinh")
    private String sex;

    @Column(name="MaTruong")
    private String SCHOOL_ID;

    @Column(name="MaHLV")
    private String COACH_ID;

}

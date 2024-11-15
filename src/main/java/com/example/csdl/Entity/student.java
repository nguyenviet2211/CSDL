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
@Table(name="student")
public class student extends SuperClass{

    @Column(name="DATE_OF_BIRTH")
    private String dateOfBirth;

    @Column(name="AGE")
    private int age;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CLASS")
    private String CLASS;

    @Column(name="SEX")
    private String sex;

    @Column(name="SCHOOL_ID")
    private String SCHOOL_ID;

    @Column(name="COACH_ID")
    private String COACH_ID;

}

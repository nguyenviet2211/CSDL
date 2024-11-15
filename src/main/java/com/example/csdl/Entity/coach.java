package com.example.csdl.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name="coach")
public class coach extends SuperClass{

    @Column(name="EMAIL")
    private String Email;

    @Column(name="SCHOOL_ID")
    private String school_Id;
}

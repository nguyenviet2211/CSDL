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
@Table(name="huanluyenvien")
public class HuanLuyenVien extends SuperClass{

    @Column(name="Email")
    private String Email;

    @Column(name="MaTruong")
    private String school_Id;
}

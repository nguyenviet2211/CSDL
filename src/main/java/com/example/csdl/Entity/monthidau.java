package com.example.csdl.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
@Table(name="monthidau")
public class monthidau {
    @Id
    @Column(name="MaMon")
    private String MaMon;

    @Column(name="Ten")
    private String Ten;

    @Column(name="GioiTinh")
    private String GioiTinh;

    @Column(name="NhomTuoi")
    private int NhomTuoi;

    @Column(name="PhanLoai")
    private String PhanLoai;

}

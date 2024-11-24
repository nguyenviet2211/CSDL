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
public class hocsinh {
    @Id
    @Column(name="MaHS")
    private String MaHS;

    @Column(name="Ten")
    private String Ten;

    @Column(name="NgaySinh")
    private String NgaySinh;

    @Column(name="Tuoi")
    private int Tuoi;

    @Column(name="DiaChi")
    private String DiaChi;

    @Column(name="Lop")
    private String Lop;

    @Column(name="GioiTinh")
    private String GioiTinh;

    @Column(name="MaTruong")
    private String MaTruong;

    @Column(name="MaHLV")
    private String MaHLV;

}

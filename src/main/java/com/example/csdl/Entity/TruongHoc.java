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
@Table(name="truonghoc")
public class TruongHoc {
    @Id
    @Column(name = "MaTruong")
    private String MaTruong;

    @Column(name="DiaChi")
    private String DiaChi;

    @Column(name = "TenTruong")
    private String Ten;
}

package com.example.csdl.Entity;

import com.example.csdl.Entity.CompositeId.ID_result;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ketqua")
@IdClass(ID_result.class)
public class ketqua {
    @Id
    @Column(name="MaHS")
    private String MaHS;

    @Id
    @Column(name="MaTran")
    private String MaTran;

    @Id
    @Column(name="MaDoi")
    private String MaDoi;

    @Id
    @Column(name="HiepDau")
    private String HiepDau;

    @Column(name="Diem")
    private int Diem;

    @Column(name="ThuHang")
    private int thuHang;

}

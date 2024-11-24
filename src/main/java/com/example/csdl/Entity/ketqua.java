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
    private String studentId;

    @Id
    @Column(name="MaTran")
    private String battleId;

    @Id
    @Column(name="MaDoi")
    private String TeamId;

    @Id
    @Column(name="HiepDau")
    private String hiepDau;

    @Column(name="Diem")
    private int point;

    @Column(name="ThuHang")
    private String thuHang;

}

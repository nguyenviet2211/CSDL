package com.example.csdl.Entity;

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
@Table(name="result")
@IdClass(ID_result.class)
public class result {
    @Id
    @Column(name="STUDENT_ID")
    private String studentId;

    @Id
    @Column(name="battle_id")
    private String battleId;

    @Id
    @Column(name="team_id")
    private String TeamId;

    @Id
    @Column(name="HIEP_DAU")
    private String hiepDau;

    @Column(name="POINT")
    private int point;

    @Column(name="THU_HANG")
    private String thuHang;

}

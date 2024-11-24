package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_JOIN_BATTLE2;
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
@IdClass(ID_JOIN_BATTLE2.class)
@Table(name="thamgiathidau")
public class thamgiathidau {
    @Id
    private String MaTran;

    @Id
    private String MaDoi;

    @Column(name="ThoiGian")
    private String time;

    @Column(name="DiaDiem")
    private String place;
}

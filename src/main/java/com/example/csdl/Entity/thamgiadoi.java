package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_thamgiadoi;
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
@Table(name="thamgiadoi")
@IdClass(ID_thamgiadoi.class)
public class thamgiadoi {
    @Id
    @Column(name="MaHS")
    private String MaHS;

    @Id
    @Column(name="MaDoi")
    private String MaDoi;
}

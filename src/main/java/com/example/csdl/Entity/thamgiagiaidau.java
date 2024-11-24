package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_thamgiagiaidau;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="thamgiagiaidau")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ID_thamgiagiaidau.class)
public class thamgiagiaidau {
    @Id
    @Column(name="MaGD")
    private String MaGD;

    @Id
    @Column(name="MaTruong")
    private String MaTruong;

}

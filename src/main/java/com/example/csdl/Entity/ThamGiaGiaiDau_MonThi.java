package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_thamgiagiaidau_monthi;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="thamgiagiaidau_monthi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ID_thamgiagiaidau_monthi.class)
public class ThamGiaGiaiDau_MonThi {

    @Id
    @Column(name="MaGD")
    private String MaGD;

    @Id
    @Column(name="MaMon")
    private String MaMon;
}

package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_taitrogiaidau;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="TaiTroGiaiDau")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ID_taitrogiaidau.class)
public class TaiTroGiaiDau {
    @Id
    @Column(name="MaGD")
    private String MaGD;

    @Id
    @Column(name="MaNhaTaiTro")
    private String MaNhaTaiTro;
}

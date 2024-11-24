package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_hlv_sdt;
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
@IdClass(ID_hlv_sdt.class)
@Table(name="hlv_sdt")
public class hlv_sdt {
    @Id
    @Column(name="MaHLV")
    private String MaHLV;

    @Id
    @Column(name="SDT")
    private String SDT;
}

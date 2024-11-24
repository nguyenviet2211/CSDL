package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_hs_sdt;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name="hs_sdt")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(ID_hs_sdt.class)
public class hs_sdt {
    @Id
    @Column(name="MaHS")
    private String MaHS;

    @Id
    @Column(name="SDT")
    private String SDT;
}

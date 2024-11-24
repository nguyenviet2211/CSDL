package com.example.csdl.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tochuc")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class tochuc {
    @Id
    @Column(name="T_MaNhaTaiTro")
    private String MaNhaTaiTro;
}

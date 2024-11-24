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
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="huanluyenvien")
public class HuanLuyenVien{
    @Id
    @Column(name="MaHLV")
    private String MaHLV;

    @Column(name="TenHLV")
    private String TenHLV;

    @Column(name="Email")
    private String Email;

    @Column(name="MaTruong")
    private String MaTruong;
}

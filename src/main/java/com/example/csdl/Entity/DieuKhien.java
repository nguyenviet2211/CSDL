package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_Dieu_khien;
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
@IdClass(ID_Dieu_khien.class)
@Table(name="dieukhien")
public class DieuKhien {
    @Id
    @Column(name = "MaTrongTai")
    private String MaTrongTai;

    @Id
    @Column(name = "MaTran")
    private String MaTran;
}

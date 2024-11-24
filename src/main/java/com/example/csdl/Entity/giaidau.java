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
@Table(name="giaidau")
public class giaidau {
    @Id
    @Column(name = "MaGD")
    private String id;

    @Column(name="Nam")
    private int year;

    @Column(name="DiaDiem")
    private String place;

    @Column(name="DonVi")
    private String donvitochuc;

}

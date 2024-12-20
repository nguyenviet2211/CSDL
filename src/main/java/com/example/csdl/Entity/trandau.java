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
@Table(name="trandau")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class trandau {
    @Id
    @Column(name="MaTran")
    private String MaTran;

    @Column(name="MaMon")
    private String MaMon;
}

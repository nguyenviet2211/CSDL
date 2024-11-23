package com.example.csdl.Entity;


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
@Table(name="trandau")
public class trandau {
    @Id
    @Column(name = "MaTran")
    private String id;

    @Column(name="MaMon")
    private String monThiId;

}

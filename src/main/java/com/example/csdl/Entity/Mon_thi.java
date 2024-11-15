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
@Table(name="mon_thi")
public class Mon_thi {
    @Id
    private String id;

    @Column(name="NAME")
    private String name;

    @Column(name="SEX")
    private String Sex;

    @Column(name="AGE")
    private int age;

    @Column(name="COMPETITION_ID")
    private String competitionId;

}

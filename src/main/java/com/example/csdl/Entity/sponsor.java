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
@Table(name="sponsor")
public class sponsor {
    @Id
    private String id;

    @Column(name="NAME")
    private String name;

    @Column(name="INFO")
    private String info;

    @Column(name="COMPETITION_ID")
    private String competitionId;
}

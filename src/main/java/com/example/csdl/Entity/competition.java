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
@Table(name="competition")
public class competition {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name="YEAR")
    private int year;

    @Column(name="PLACE")
    private String place;

    @Column(name="DONVITOCHUC")
    private String donvitochuc;

}

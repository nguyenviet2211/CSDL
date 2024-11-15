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
@IdClass(JOIN_BATTLE2.class)
@Table(name="join_battle2")
public class JOIN_BATTLE2 {
    @Id
    private String battleId;

    @Id
    private String teamId;

    @Column(name="TIME")
    private String time;

    @Column(name="PLACE")
    private String place;
}

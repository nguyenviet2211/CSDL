package com.example.csdl.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
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
@IdClass(ID_JOIN_BATTLE.class)
@Table(name="join_battle")
public class JOIN_BATTLE {
    @Id
    private String studentId;

    @Id
    private String battleId;
}

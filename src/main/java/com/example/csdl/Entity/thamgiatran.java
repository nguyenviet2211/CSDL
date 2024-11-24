package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_JOIN_BATTLE;
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
@Table(name="thamgiatran")
public class thamgiatran {
    @Id
    private String MaHS;

    @Id
    private String MaTran;
}

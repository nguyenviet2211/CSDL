package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_JOIN_TEAM;
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
@Table(name="competition")
@IdClass(ID_JOIN_TEAM.class)
public class join_team {
    @Id
    private String studentId;

    @Id
    private String teamId;
}

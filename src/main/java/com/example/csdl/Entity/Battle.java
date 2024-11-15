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
@Table(name="battle")
public class Battle{
    @Id
    private String id;

    @Column(name="MON_THI_ID")
    private String monThiId;

}

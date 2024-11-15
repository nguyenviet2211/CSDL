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
@IdClass(ID_CONTROL.class)
@Table(name="control")
public class control {
    @Id
    private String trongTaiId;

    @Id
    private String battleId;
}

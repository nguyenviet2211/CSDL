package com.example.csdl.Entity;


import com.example.csdl.Entity.CompositeId.ID_CONTROL;
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
@Table(name="dieukhien")
public class dieukhien {
    @Id
    @Column(name = "MaTrongTai")
    private String trongTaiId;

    @Id
    @Column(name = "MaTran")
    private String battleId;
}

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
@Table(name="tt_sdt")
@IdClass(ID_TRONG_TAI.class)
public class tt_sdt {
    @Id
    @Column(name = "MaTrongTai")
    private String trongTaiId;

    @Id
    @Column(name = "SDT")
    private String phoneNumber;
}

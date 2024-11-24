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
@Table(name = "trongtai")
public class trongtai{
    @Id
    @Column(name="MaTrongTai")
    private String MaTrongTai;

    @Column(name="Ten")
    private String Ten;

    @Column(name="MaMon")
    private String monThiId;
}

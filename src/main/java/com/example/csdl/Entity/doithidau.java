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
@Table(name="doithidau")
public class doithidau {
    @Id
    @Column(name = "MaDoi")
    private String id;

    @Column(name="TenDoi")
    private String name;

    @Column(name="MaMon")
    private String monThiId;
}

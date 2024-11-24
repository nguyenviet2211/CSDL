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
<<<<<<<< HEAD:src/main/java/com/example/csdl/Entity/Tran_dau.java
@Table(name="battle")
public class Tran_dau {
========
@Table(name="trandau")
public class trandau {
>>>>>>>> refs/heads/HaLe:src/main/java/com/example/csdl/Entity/trandau.java
    @Id
    @Column(name = "MaTran")
    private String id;

    @Column(name="MaMon")
    private String monThiId;

}

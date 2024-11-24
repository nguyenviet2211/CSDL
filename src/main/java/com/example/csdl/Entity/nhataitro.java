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
@Table(name="nhataitro")
public class nhataitro {
    @Id
    @Column(name = "MaTT")
    private String id;

    @Column(name="Ten")
    private String Ten;

    @Column(name="ThongTin")
    private String ThongTin;
}

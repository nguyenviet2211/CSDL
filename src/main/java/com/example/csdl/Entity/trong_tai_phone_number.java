package com.example.csdl.Entity;

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
@Table(name="trong_tai_phone_number")
@IdClass(ID_TRONG_TAI.class)
public class trong_tai_phone_number {
    @Id
    private String trongTaiId;

    @Id
    private String phoneNumber;
}

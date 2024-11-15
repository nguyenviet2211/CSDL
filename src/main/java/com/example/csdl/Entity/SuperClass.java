package com.example.csdl.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;


@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class SuperClass {
    
    @Id
    private String ID;

    @Column
    private String NAME;

    @Column
    private String PHONE_NUMBER;

}

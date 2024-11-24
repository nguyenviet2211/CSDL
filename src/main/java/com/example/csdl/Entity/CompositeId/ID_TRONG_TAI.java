package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_TRONG_TAI implements Serializable {
    private String MaTrongTai;
    private String SDT;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_TRONG_TAI that = (ID_TRONG_TAI) o;
        return Objects.equals(MaTrongTai, that.MaTrongTai) &&
                Objects.equals(SDT, that.SDT);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaTrongTai, SDT);
    }
}

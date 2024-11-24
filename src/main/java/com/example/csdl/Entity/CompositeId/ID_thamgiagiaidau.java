package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_thamgiagiaidau implements Serializable {
    private String MaGD;
    private String MaTruong;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_thamgiagiaidau that = (ID_thamgiagiaidau) o;
        return Objects.equals(MaGD, that.MaGD) &&
                Objects.equals(MaTruong, that.MaTruong);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaGD, MaTruong);
    }
}

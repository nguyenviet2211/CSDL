package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_thamgiagiaidau_monthi implements Serializable {
    private String MaGD;
    private String MaMon;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_thamgiagiaidau_monthi that = (ID_thamgiagiaidau_monthi) o;
        return Objects.equals(MaGD, that.MaGD) &&
                Objects.equals(MaMon, that.MaMon);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaGD, MaMon);
    }
}

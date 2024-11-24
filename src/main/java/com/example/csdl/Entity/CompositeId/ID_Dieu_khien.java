package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_Dieu_khien implements Serializable {
    private String MaTrongTai;
    private String MaTran;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_Dieu_khien that = (ID_Dieu_khien) o;
        return Objects.equals(MaTrongTai, that.MaTrongTai) &&
                Objects.equals(MaTran, that.MaTran);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaTrongTai, MaTran);
    }
}

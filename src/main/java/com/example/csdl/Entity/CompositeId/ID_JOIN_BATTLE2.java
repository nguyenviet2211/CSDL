package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_JOIN_BATTLE2 implements Serializable {
    private String MaTran;
    private String MaDoi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_JOIN_BATTLE2 that = (ID_JOIN_BATTLE2) o;
        return Objects.equals(MaTran, that.MaTran) &&
                Objects.equals(MaDoi, that.MaDoi);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaTran, MaDoi);
    }
}

package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_thamgiadoi implements Serializable {
    private String MaHS;
    private String MaDoi;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_thamgiadoi that = (ID_thamgiadoi) o;
        return Objects.equals(MaHS, that.MaHS) &&
                Objects.equals(MaDoi, that.MaDoi);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaHS, MaDoi);
    }
}

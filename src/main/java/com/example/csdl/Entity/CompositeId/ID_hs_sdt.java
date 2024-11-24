package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_hs_sdt implements Serializable {
    private String MaHS;
    private String SDT;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_hs_sdt that = (ID_hs_sdt) o;
        return Objects.equals(MaHS, that.MaHS) &&
                Objects.equals(SDT, that.SDT);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaHS, SDT);
    }
}

package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_hlv_sdt implements Serializable {
    private String MaHLV;
    private String SDT;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_hlv_sdt that = (ID_hlv_sdt) o;
        return Objects.equals(MaHLV, that.MaHLV) &&
                Objects.equals(SDT, that.SDT);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaHLV, SDT);
    }
}

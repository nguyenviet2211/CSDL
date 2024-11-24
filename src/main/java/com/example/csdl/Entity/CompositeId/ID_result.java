package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_result implements Serializable {
    private String MaHS;
    private String MaTran;
    private String MaDoi;
    private String HiepDau;

    public ID_result() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_result that = (ID_result) o;
        return Objects.equals(MaHS, that.MaHS) &&
                Objects.equals(MaTran, that.MaTran) &&
                Objects.equals(MaDoi, that.MaDoi) &&
                Objects.equals(HiepDau, that.HiepDau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(MaHS, MaTran, MaDoi, HiepDau);
    }
}

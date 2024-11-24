package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_taitrogiaidau implements Serializable{
    private String MaGD;
    private String MaNhaTaiTro;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_taitrogiaidau that = (ID_taitrogiaidau) o;
        return Objects.equals(MaGD, that.MaGD) &&
                Objects.equals(MaNhaTaiTro, that.MaNhaTaiTro);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(MaGD, MaNhaTaiTro);
    }
}

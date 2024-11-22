package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_CONTROL implements Serializable {
    private String trongTaiId;
    private String battleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_CONTROL that = (ID_CONTROL) o;
        return Objects.equals(trongTaiId, that.trongTaiId) &&
                Objects.equals(battleId, that.battleId);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(trongTaiId, battleId);
    }
}

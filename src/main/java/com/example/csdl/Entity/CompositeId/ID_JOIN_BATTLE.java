package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_JOIN_BATTLE implements Serializable {
    private String studentId;
    private String battleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_JOIN_BATTLE that = (ID_JOIN_BATTLE) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(battleId, that.battleId);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(battleId, battleId);
    }
}

package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_JOIN_BATTLE2 implements Serializable {
    private String battleId;
    private String teamId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_JOIN_BATTLE2 that = (ID_JOIN_BATTLE2) o;
        return Objects.equals(battleId, that.battleId) &&
                Objects.equals(teamId, that.teamId);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(battleId, teamId);
    }
}

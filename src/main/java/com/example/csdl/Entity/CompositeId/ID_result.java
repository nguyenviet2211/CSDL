package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_result implements Serializable {
    private String studentId;
    private String battleId;
    private String TeamId;
    private String hiepDau;

    public ID_result() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_result that = (ID_result) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(battleId, that.battleId) &&
                Objects.equals(TeamId, that.TeamId) &&
                Objects.equals(hiepDau, that.hiepDau);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, battleId, TeamId, hiepDau);
    }
}

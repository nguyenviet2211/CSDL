package com.example.csdl.Entity.CompositeId;

import java.io.Serializable;
import java.util.Objects;

public class ID_JOIN_TEAM implements Serializable {
    private String studentId;
    private String teamId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_JOIN_TEAM that = (ID_JOIN_TEAM) o;
        return Objects.equals(studentId, that.studentId) &&
                Objects.equals(teamId, that.teamId);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(studentId, teamId);
    }
}

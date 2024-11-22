package com.example.csdl.Entity.CompositeId;


import java.io.Serializable;
import java.util.Objects;

public class ID_STUDENT implements Serializable {
    private String studentID;
    private String phoneNumber;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ID_STUDENT that = (ID_STUDENT) o;
        return Objects.equals(studentID, that.studentID) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(studentID, phoneNumber);
    }
}

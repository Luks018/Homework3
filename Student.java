package lms;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String surname;
    private String personalNumber;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }

    // Override equals and hashCode for proper comparison and usage in collections
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return personalNumber.equals(student.personalNumber);
    }

    @Override
    public int hashCode() {
        return personalNumber.hashCode();
    }
}

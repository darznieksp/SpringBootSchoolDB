package com.example.SpringBootSchoolDB.student;

import jakarta.persistence.*;

@Entity
@Table(name = "student_list")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column (name = "last_name")
    private String lastName;

    @Column (name = "grade")
    private String grade;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade(){
        return grade;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }
}

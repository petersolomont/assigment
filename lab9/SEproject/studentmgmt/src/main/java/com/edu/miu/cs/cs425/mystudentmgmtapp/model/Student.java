package com.edu.miu.cs.cs425.mystudentmgmtapp.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentid;
    @Column(name ="studentNumber",nullable = false)
    private String studentNumber;
    @Column(name ="firstname",nullable = false)
    private String firstname;
    @Column(name ="middleName",nullable = false)
    private String middleName;
    @Column(name ="lastName",nullable = false)
    private String lastName;
    @Column(name ="gpa",nullable = false)
    private Double gpa;
    @Column(name ="dateofEnrollment",nullable = false)
    private LocalDate dateofEnrollment;

    public Student(Long studentid, String studentNumber, String firstname, String middleName, String lastName, Double gpa, LocalDate dateofEnrollment) {
        this.studentid = studentid;
        this.studentNumber = studentNumber;
        this.firstname = firstname;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.dateofEnrollment = dateofEnrollment;
    }

    public Student() {
    }

    public Student(Long studentid) {
        this.studentid = studentid;
    }

    public Long getStudentid() {
        return studentid;
    }

    public void setStudentid(Long studentid) {
        this.studentid = studentid;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public LocalDate getDateofEnrollment() {
        return dateofEnrollment;
    }

    public void setDateofEnrollment(LocalDate dateofEnrollment) {
        this.dateofEnrollment = dateofEnrollment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid=" + studentid +
                ", studentNumber='" + studentNumber + '\'' +
                ", firstname='" + firstname + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gpa=" + gpa +
                ", dateofEnrollment=" + dateofEnrollment +
                '}';
    }
}

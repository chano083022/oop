/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentinfo;
import java.io.Serializable;
/**
 *
 * @author User
 */
import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String course;
    private double gpa;

    public Student(String id, String name, String address, int age, String course, double gpa) {
        super(id, name, address, age);
        this.course = course;
        this.gpa = gpa;
    }

    // Getters and Setters
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}

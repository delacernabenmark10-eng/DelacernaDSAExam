/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class StudentRankingSystem {
    private final String studentId;
    private final String name;
    private final String course;
    private final double grade;

    public StudentRankingSystem(String studentId, String name, String course, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getGrade() {
        return grade;

    }
}

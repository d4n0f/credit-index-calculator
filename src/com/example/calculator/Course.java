package com.example.calculator;

public class Course {
    private String courseName;
    private int credit;
    private Grades grade;
    private ClassType classType;

    public Course(String courseName, int credit, Grades grade) {
        this.courseName = courseName;
        this.credit = credit;
        this.grade = grade;
    }

    public Course(String courseName, ClassType classType, Grades grade) {
        this.courseName = courseName;
        this.classType = classType;
        this.grade = grade;

        switch (classType) {
            case MANDATORY:
                this.credit = 6;
                break;
            case ELECTIVE:
                this.credit = 3;
                break;
            case OPTIONAL:
                this.credit = 2;
                break;
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredit() {
        return credit;
    }

    public Grades getGrade() {
        return grade;
    }

    public ClassType getClassType() {
        return classType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("courseName='").append(courseName).append('\'');
        sb.append(", credit=").append(credit);
        sb.append(", grade=").append(grade);
        sb.append(", classType=").append(classType);
        sb.append('}');
        return sb.toString();
    }
}

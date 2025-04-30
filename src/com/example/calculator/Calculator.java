package com.example.calculator;

import java.util.List;

public class Calculator {
    private List<Course> courses;

    public Calculator(List<Course> courses) {
        this.courses = courses;
    }

    public int getTotalCredits() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }

    private int getProdOfCreditsAndGrades() {
        return courses.stream()
                .mapToInt(course -> course.getGrade().getValue() * course.getCredit())
                .sum();
    }

    public double getCreditIndex() {
        double prodOfCreditsAndGrades = getProdOfCreditsAndGrades();
        double totalCredits = getTotalCredits();

        return prodOfCreditsAndGrades / totalCredits;
    }
}
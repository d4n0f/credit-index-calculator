package com.example.calculator;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Course> courseList = List.of(
                new Course("Course1", 6, Grades.FIVE),
                new Course("Course2", 6, Grades.FIVE),
                new Course("Course3", 3, Grades.FOUR),
                new Course("Course4", ClassType.OPTIONAL, Grades.THREE)
        );

        var calculator = new Calculator(courseList);
        System.out.println("Total credits: " + calculator.getTotalCredits());
        System.out.println("Credit index: " + calculator.getCreditIndex());
    }
}
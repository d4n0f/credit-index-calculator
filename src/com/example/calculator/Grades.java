package com.example.calculator;

public enum Grades {
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2),
    ONE(1);

    private int grade;

    private Grades(int grade) {
        this.grade = grade;
    }

    public int getValue() {
        return grade;
    }
}


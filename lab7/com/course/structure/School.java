package com.course.structure;

public class School extends Building {
    private int classrooms;
    private String gradeLevel;

    // Constructor
    public School(int squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    // Accessor methods
    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

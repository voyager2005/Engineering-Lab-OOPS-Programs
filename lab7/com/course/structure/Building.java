package com.course.structure;

public class Building {
    private int squareFootage;
    private int stories;

    // Constructor
    public Building(int squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    // Accessor methods
    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getStories() {
        return stories;
    }

    public void setStories(int stories) {
        this.stories = stories;
    }
}


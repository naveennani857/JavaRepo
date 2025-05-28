package com.ultron.in30Minutes;

public class Courses {
    private String course;
    private String courseType;
    private int rating;
    private int noOfStudents;

    public Courses(String course,String courseType, int rating, int noOfStudents){
        this.course=course;
        this.courseType=courseType;
        this.rating=rating;
        this.noOfStudents=noOfStudents;
    }

    // Getters
    public String getcourse() {
        return course;
    }

    public String getcourseType() {
        return courseType;
    }

    public int getRating() {
        return rating;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    // Setters
    public void setcourse(String course) {
        this.course = course;
    }

    public void setcourseType(String courseType) {
        this.courseType = courseType;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    // toString
    @Override
    public String toString() {
        return course +
                " :: " + courseType +
                " :: " + rating +
                " :: " + noOfStudents;
    }

}

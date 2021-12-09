package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;

    // Constructor
    public Student (String firstName,String lastName,ArrayList<Double> examScores ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores=examScores;
    }


}

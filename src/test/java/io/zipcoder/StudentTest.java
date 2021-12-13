package io.zipcoder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentTest {


    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void getNumberOfExamsTaken() {


    }

    @Test
    public void getExamScores() {
    }

    @Test
    public void addExamScore() {
    }

    @Test
    public void setExamScore() {

        //Given
        ArrayList<Double> examScores= new ArrayList<>(Arrays.asList(70.0));
        Student student = new Student ("john", "SMITH",examScores);
        String s = student.setExamScore(0, 85.50);
        String expected = "Exam 1-> 85.5";

        //When
        String actual = student.setExamScore(0,85.5);

        // Then
        Assert.assertEquals(expected, actual);


    }


    @Test
    public void getAverageExamScore() {

        //Given
        String firstName = "Malick";
        String lastName = " KONE";
        ArrayList<Double> examScores= new ArrayList<>(Arrays.asList(70.0,120.0, 80.0));
        Student student = new Student(firstName, lastName, examScores);
        Double expected = 90.00;

        // when
        Double actual = student.getAverageExamScore();

        //Then
        Assert.assertEquals(expected,actual);
    }




    @Test
    public void testToString() {

//        //Given
//        String firstName = "Tra";
//        String lastName = " DIE";
//        ArrayList <Double> examScores= new ArrayList<>(Arrays.asList(70.0,120.0, 80.0));
//        Student student = new Student (firstName,lastName, examScores );
//
//        String expected = "Student Name : Tra DIE\n" + " Average Score : 90.0 \n" + " Exam Scores:\n" +
//            "\t Exam 1 -> 70\n" + "\t Exam 2 -> 120\n" + "\t Exam 3 -> 80\n";
//
//        // When
//
//        String actual = student.toString();
//
//        // Then
//        Assert.assertEquals(expected, actual);


    }
}
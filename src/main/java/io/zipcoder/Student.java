package io.zipcoder;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores = new ArrayList<>();

    // Constructor
    public Student (String firstName,String lastName, ArrayList<Double> examScores ) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores=examScores;
    }

    public Student() {
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken() {
        return examScores.size();

    }

    public String getExamScores() {
//        formatting for exams scores will be like "Exam 1 -> 100"
        StringBuilder examScoreOutput = new StringBuilder();
        examScoreOutput.append("Exam Scores: \n");
        for (int j = 0; j < examScores.size(); j++) {
            examScoreOutput.append(String.format("\tExam %s -> %s \n", (j + 1), Math.round(examScores.get(j))));
        }
        return examScoreOutput.toString();

    }

    public void addExamScore(double examScore) {

        this.examScores.add(examScore);
    }


    public void setExamScore(int examNumber, double newScore) {

        this.examScores.set(examNumber, newScore);

    }


    public Double  getAverageExamScore() {
        Double sumScore = 0.0;
        for (int j = 0; j < this.examScores.size(); j++) {
            sumScore+=this.examScores.get(j);
        }

        Double avgScore = sumScore/(this.examScores.size());
        return avgScore;
//        String outputBorder = "\\`\\`\\`";
//        String avgScoreOutput = String.format("%s\n %1f\n%s", outputBorder,avgScore,outputBorder);
//        return avgScoreOutput;

  }

    public void displayAverageExamScore() {

        String outputBorder = "\\`\\`\\`";
        String avgScoreOutput = String.format("%s\n %1f\n%s", outputBorder,getAverageExamScore(),outputBorder);
        System.out.println(avgScoreOutput);
    }




    @Override
    public String toString() {
//        return "Student {" +
//                "firstName='" + firstName + '\'' +
//
//                ", lastName='" + lastName + '\'' +
//
//                ", examScores=" + examScores +
//
//                '}';

        return "Student " +
                "Student Name : " + getFirstName() + " " + getLastName() + "\n Average Score : " + getAverageExamScore() +
                "\n Exam Scores : \n" + getExamScores();

    }





}

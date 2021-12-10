package io.zipcoder;

import java.util.*;

public class Classroom {

    private int maxNumberOfStudents;
    private Student[] students;
    private ArrayList <Student> studList;

    // first constructor
    public Classroom (int maxNumberOfStudents ) {

        this.maxNumberOfStudents = maxNumberOfStudents;
        students = new Student[maxNumberOfStudents];
    }

        // second constructor

     public Classroom (Student [] students) {
         this.students = students;
        }

     // Third constructor : nullary constructor
     public Classroom ()   {
            this.students = new Student[30];
            studList = new ArrayList<>();
        }


     public Student [] getStudents() {
        return students;
     }

     public Double getAverageExamScore() {

        Double sum = 0.0;
        for (Student anyStudent : students) {
            sum+= anyStudent.getAverageExamScore();
        }

        return sum/students.length;
     }

     public void addStudent (Student student ) {
//        ArrayList<Student> studList = new ArrayList<>(Arrays.asList(students));
//        studList.add(Arrays.asList(students));

         for (int i = 0; i < students.length; i++) {
             students[i]=student;
         }

     }

     public void removeStudent(String firstName, String lastName) {
         List<Student> studentList = new ArrayList<>(Arrays.asList(students));
         for (Student anyStudent : studentList) {
             if (anyStudent.getFirstName().equalsIgnoreCase(firstName) && anyStudent.getLastName().equalsIgnoreCase(lastName));
             studList.remove(anyStudent);
             break;
         }
//         Collections.sort(studentList);
         studentList.sort((Comparator<? super Student>) this);
         this.students = studentList.toArray(new Student[]{});

         }

     public List<Student> getStudentByScore(Student [] students) {
//         Arrays.sort(students, Collections.reverseOrder());
         List <Student> studentList = new ArrayList<>(Arrays.asList(students));
         studentList.sort((Comparator<? super Student>) this);
         return studentList;

     }

    public Map<Student, String> getGradebook() {
        Map<Student, String> gradebook = new HashMap<>();
        String grade = "";
        for (Student student : students) {
            if (student.getAverageExamScore() >= 90)
                grade = "A";
            else if (student.getAverageExamScore() >= 80)
                grade = "B";
            else if (student.getAverageExamScore() >= 70)
                grade = "C";
            else if (student.getAverageExamScore() >= 60)
                grade = "D";
            else
                grade = "F";
            gradebook.put(student, grade);
        }
        return gradebook;
    }


}



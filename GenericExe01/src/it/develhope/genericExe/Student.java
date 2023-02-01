package it.develhope.genericExe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

String studentName;
String studentSurname;
double marksAverage;



    public Student(String studentName, String studentSurname, double marksAverage) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.marksAverage = marksAverage;
    }

    public static Number getAverageMark(List<? extends Number> listOfMarks){

        double sum = listOfMarks.get(0).doubleValue() + listOfMarks.get(1).doubleValue();
        sum = sum/2;
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", marksAverage=" + marksAverage +
                '}';
    }
}

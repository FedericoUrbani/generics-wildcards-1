package it.develhope.genericExe;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

      List <Double> individualMarksListLisa = new ArrayList<Double>();
      List <Integer> projectMarksListJeremy = new ArrayList<Integer>();

        individualMarksListLisa.add(0.9);
        individualMarksListLisa.add(3.9);
        projectMarksListJeremy.add(2);
        projectMarksListJeremy.add(4);
        System.out.println(Student.getAverageMark(individualMarksListLisa));
        System.out.println(Student.getAverageMark(projectMarksListJeremy));

        List <Student> listOfStudent = new ArrayList<>();
        listOfStudent.add(new Student("Lisa", "Stuart", (Double) Student.getAverageMark(individualMarksListLisa)));
        listOfStudent.add(new Student("Jeremy", "Green",(Double) Student.getAverageMark(projectMarksListJeremy)));

        System.out.println(listOfStudent.get(0));
        System.out.println(listOfStudent.get(1));
    }
}

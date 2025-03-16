package optiveTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentManagement {


    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Nikhil", List.of(10, 20, 90, 60, 80)));
        list.add(new Student(102, "Utkarsh", List.of(10, 60, 40, 60, 80)));
        list.add(new Student(101, "Nikhil", List.of(10, 20, 90, 60, 80)));
        list.add(new Student(101, "Aditya", List.of(10, 87, 40, 60, 80)));
        list.add(new Student(104, "Ayush", List.of(10, 20, 40, 60, 80)));

        //Calculate Average Of Students
        list.sort(Comparator.comparingDouble(Student::calculateAverage));

        //Removing Duplicates
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }


        //Printing Student
        for (Student s : list) {
            if (s.calculateAverage() > 40) {
                System.out.println(s + " : Pass");
            } else {
                System.out.println(s + " : Fail ");
            }

        }
    }
}

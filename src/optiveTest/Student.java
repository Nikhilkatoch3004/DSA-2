package optiveTest;

import java.util.List;
import java.util.Objects;

public class Student {
    private int rollNum;
    private String name;
    private List<Integer> marks;

    public int getRollNum() {
        return rollNum;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public Student(int rollNum, String name, List<Integer> marks) {
        this.rollNum = rollNum;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                ", averageMarks=" + calculateAverage() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && Objects.equals(name, student.name) && Objects.equals(marks, student.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNum, name, marks);
    }

    public double calculateAverage() {
        double sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / marks.size();
    }


}

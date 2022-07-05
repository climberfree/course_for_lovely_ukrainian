package borodinOleh.hw3;

import java.util.ArrayList;

import static java.util.Comparator.comparingInt;

public class Student implements Comparable<Student> {
    private final String name;
    private final int score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }

    public static void printList() {
        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(new Student("Oleh", 8));
        studentsList.add(new Student("Slava", 6));
        studentsList.add(new Student("Olga", 2));
        studentsList.add(new Student("Stas", 5));
        studentsList.add(new Student("Kosty", 10));
        studentsList.add(new Student("Misha", 1));
        studentsList.add(new Student("Masha", 9));

        studentsList.sort(comparingInt(Student::getScore));


        for (Student i : studentsList) {
            System.out.println(i);
        }
    }
}

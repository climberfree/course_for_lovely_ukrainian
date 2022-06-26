package hw3;

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    private int score;

    public Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.score - o.score;
    }

    public static void main(String[] args) {
        ArrayList<Student> myList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <20 ; i++) {
            myList.add(new Student("student"+i, random.nextInt(100) ));

            myList.sort(new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return o1.score- o2.score;
                }
            });

        }
        for (Student temp: myList) {
            System.out.println(temp);
        }
    }
}

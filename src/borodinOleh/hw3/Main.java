package borodinOleh.hw3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello, you can choose a task ");
        System.out.println("Click 1 for return the shortest string in PriorityQueue\n" +
                "Click 2 for print a list of students in order of their scores. ");

        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        int number = choice.read();
        if(number==49){
            ShortestString.shortestString();
        } else if(number==50){
            Student.printList();
        }else {
            System.out.println("You wrote incorrect number");

        }



    }
}


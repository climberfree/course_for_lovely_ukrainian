package borodinOleh.hw3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ShortestString {

    public static void shortestString(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(String::length));
        priorityQueue.add("Oleh");
        priorityQueue.add("Ira");
        priorityQueue.add("Andrey");
        priorityQueue.add("Stanislav");
        priorityQueue.add("Viktor");

        while (priorityQueue.size() !=0 ) {
            System.out.println(priorityQueue.poll());


        }
    }
}

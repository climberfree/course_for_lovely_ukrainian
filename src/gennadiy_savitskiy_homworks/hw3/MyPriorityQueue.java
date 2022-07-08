package gennadiy_savitskiy_homworks.hw3;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {
    // Create a priority queue of String, make poll() method return the shortest string.

    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
                public int compare(String o1, String o2) {
                    if (o1.length() > o2.length()){
                        return 1;
                    }else if (o1.length() < o2.length()){
                        return -1;
                    }else return 0;
                }

        });
        pq.add("Hello world");
        pq.add("Hello world Hello worldHello worldHello worldHello worldHello worldHello world");
        pq.add("Hello world Hello worldHello worldHello worldHello worldHello worldHello worldHello worldHello world");
        pq.add("Hero");
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
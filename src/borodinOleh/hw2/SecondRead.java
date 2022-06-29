package borodinOleh.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SecondRead {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        File myFile = new File("/Users/olegborodi/Desktop/text.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNext()) {
                sb.append(sc.nextLine() + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(sb.toString());
    }
}

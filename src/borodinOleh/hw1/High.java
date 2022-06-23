package homework.hw1;

import java.util.Scanner;

public class High {
    static int input = getNumber();

    public static int getNumber(){
        System.out.println("Write number");
        Scanner in = new Scanner(System.in);
        int result = in.nextInt();
        return result;

    }

    public static void palindrome(){
        String str = String.valueOf(input), reverseStr = "";


        for (int i = (str.length() - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }

        if (str.equals(reverseStr)) {
            System.out.println(str + " is a Palindrome");
        }
        else {
            System.out.println(str + " is not a Palindrome");
        }
    }
}

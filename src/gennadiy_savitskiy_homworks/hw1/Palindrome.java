package gennadiy_savitskiy_homworks.hw1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter integer number");
        String userInput = sc.next();

        String reverseUserInput = new StringBuffer(userInput).reverse().toString();

        if (userInput.equals(reverseUserInput)) System.out.println("true");
        else {
            System.out.println("false");
        }

    }
}


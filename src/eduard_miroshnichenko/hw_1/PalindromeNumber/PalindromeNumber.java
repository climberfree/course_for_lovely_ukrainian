package com.example.hw_1.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        int r;
        int sum = 0;
        int temp;
        System.out.println("Please enter number for check palindrome: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();//It is the number variable to be checked for palindrome
        temp = n;
        while(n > 0){
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}

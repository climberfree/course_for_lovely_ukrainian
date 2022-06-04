package com.free.high;


public class Polindrome {

    public static void main(String[] args) {
        System.out.println("----START----");

        System.out.print("Is "+ args[0]+ " polindrome? => ");
        System.out.println(isPalindrome(Integer.parseInt(args[0])));

        System.out.println("-------------");
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int revertedInt = 0;
        while (x > revertedInt) {
            revertedInt = revertedInt * 10 + x % 10;
            x = x / 10;
        }
        return x==revertedInt || x == revertedInt/10;
    }
}

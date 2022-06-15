package com.example.hw_1.MediumLevel;

public class MediumLevel {
    public static void main(String[] args) {
        System.out.println("Arguments reverse:");

        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}

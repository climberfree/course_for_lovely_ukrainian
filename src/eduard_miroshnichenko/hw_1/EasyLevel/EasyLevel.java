package com.example.hw_1.EasyLevel;

public class EasyLevel {
    public static void main(String[] args) {
        System.out.println("-------Start easy level---------");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("-------Start first exercise-------");
        System.out.println("-------Print array-------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("--------Reverse print array---------");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
        System.out.println("--------End first exercise-------");
    }
}


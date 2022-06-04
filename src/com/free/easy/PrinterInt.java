package com.free.easy;

class PrinterInt {

     static void printAll(int[] inputs) {

        System.out.println("---------<PRINT_ALL>---------");

        for (int input : inputs) {
            System.out.println(input);
        }

        System.out.println("-----------------------------");
    }

    static void printAllReverse(int[] inputs) {

        System.out.println("-----<PRINT_ALL_REVERSE>-----");

        for (int i = inputs.length-1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }

        System.out.println("-----------------------------");
    }
}

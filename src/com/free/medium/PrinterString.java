package com.free.medium;

class PrinterString {

     static void printAll(String[] inputs) {

        System.out.println("---------<PRINT_ALL>---------");

        for (String input : inputs) {
            System.out.println(input);
        }

        System.out.println("-----------------------------");
    }

    static void printAllReverse(String[] inputs) {

        System.out.println("-----<PRINT_ALL_REVERSE>-----");

        for (int i = inputs.length-1; i >= 0; i--) {
            System.out.println(inputs[i]);
        }

        System.out.println("-----------------------------");
    }
}

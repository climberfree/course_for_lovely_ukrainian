package homework.hw1;


import java.util.Scanner;

public class Easy {

    public  static int[] arr = {1,2,3,4,5};

    public static void printArray(){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void revArray(){

        for (int i = arr.length-1; i>=0; i--){
            System.out.println(i);

        }
    }

    public static void reversArray(){
        int n = arr.length;
        int temp;
        for (int i = 0; i < n/2; i++) {
            temp = arr[n-i-1];
            arr[n-i-1] = arr[i];
            arr[i] = temp;
        }
        for (int i: arr){
            System.out.println(i);
        }
    }

    public static void getArgument(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your argument 1");
        String argument1 = scanner.nextLine();
        System.out.println("Write your argument 2");
        String argument2 = scanner.nextLine();
        System.out.println("Write your argument 3");
        String argument3 = scanner.nextLine();
        System.out.println("You write "+ argument1);
        System.out.println("You write "+ argument2);
        System.out.println("You write "+ argument3);
    }

    public static void getReversArgument(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your argument 1");
        String argument1 = scanner.nextLine();
        System.out.println("Write your argument 2");
        String argument2 = scanner.nextLine();
        System.out.println("Write your argument 3");
        String argument3 = scanner.nextLine();
        System.out.println("You write "+ argument3);
        System.out.println("You write "+ argument2);
        System.out.println("You write "+ argument1);
    }

}



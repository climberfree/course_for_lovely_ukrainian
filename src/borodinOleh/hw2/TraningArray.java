package homework.hw2;

public class TraningArray {

    public static void sumArrayElements() {

        int[][] arr = {{1, 2, 3, 4, 5}, {3, 5, 7}, {5, 6}, {3, 4, 6, 7, 8}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    sum +=arr [i][j] ;

            }
            System.out.println(sum);
            sum =0;
        }

    }
}


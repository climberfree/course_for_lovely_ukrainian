package gennadiy_savitskiy.hw2;

public class DimensionArray {

    public static int sumSimpleArr(int[] inArr) {
        int sumSimArr = 0;
        for (int s = 0; s < inArr.length; s++) {
            sumSimArr += inArr[s];
        }
        return sumSimArr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {3, 5, 7}, {5, 6}, {3, 4, 6, 7, 8}};
        int[] resultArr = new int[arr.length];


        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = sumSimpleArr(arr[i]);
        }

        for (int k = 0; k < resultArr.length; k++) {
                System.out.println(resultArr[k]);
            }

    }

}









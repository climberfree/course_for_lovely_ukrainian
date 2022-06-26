package hw3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class ArrSortToArrList {

    public static ArrayList ArrSortToArrList(int [] arr, int k ){
        ArrayList<Integer> myArrList = new ArrayList<>();
        arr = Arrays.stream(arr).filter(value -> value > k).toArray();
        for (int j : arr) {
            myArrList.add(j);
        }
        myArrList.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2){
                    return 1;
                }else if (o1 < o2){
                    return -1;
                }else return  0;
            }
        });
        return myArrList;
    }

    public static void main(String[] args) {
        int [] exampleArr = {54,676,565,56,90,1,234,6,8990,3,5, 100, 47,677,3,12,};
        int x = 20;

        System.out.println(ArrSortToArrList(exampleArr, x));
    }
}

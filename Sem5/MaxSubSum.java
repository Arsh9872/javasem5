package Sem5;

import java.util.Arrays;

public class MaxSubSum {
    public static void main(String[] args) {

    //  int[][] arr= {{1,2,3},{2,4,6},{3,7,9}};

    //  System.out.println(arr); // if print directly it will print only address
    // System.out.println(Arrays.toString(arr));  //print address because array is inside array
    // System.out.println(Arrays.deepToString(arr));
    int[][] arr = getArr();

    printArr(arr);

    }

    public static int[][] getArr(){
        return new int[][]{{1,2,3},{5,6,7},{6,7,8,9}};   //jagged or ragged array = all different [i]&[j]

    }
    public static void printArr(int[][] arr){
        // System.out.println(Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
            // System.out.println(Arrays.toString(arr[i]));
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}

package Sem5;

import java.util.Arrays;

public class StringExercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, -7, -8, -9};
        // int[] odd = new int[(arr.length + 1) / 2]; 
        // int[] even = new int[arr.length / 2]; 
        // int index = 0; 
        // int In = 0;

        // for (int i = 0; i < arr.length; i += 2) {
        //     odd[index++] = arr[i]; 
        // }
        // for (int i = 1; i < arr.length; i += 2) {
        //     even[In++] = arr[i]; 
        // }


        // System.out.println(Arrays.toString(odd));
        // System.out.println(Arrays.toString(even));
        // System.out.println();
       
        int[] temp = new int[arr.length];
        int oddIndex = 0;
        int evenIndex = arr.length - 1;

        for (int num : arr) {
            if (num % 2 != 0) {
                temp[oddIndex++] = num;
            } else {
                temp[evenIndex--] = num;
            }
        }

        // Concatination
        int[] result = new int[arr.length];
        System.arraycopy(temp, 0, result, 0, oddIndex);
        System.arraycopy(temp, evenIndex + 1, result, oddIndex, arr.length - oddIndex);

        System.out.println(Arrays.toString(result));
    }



    }


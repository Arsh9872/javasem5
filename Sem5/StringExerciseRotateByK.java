package Sem5;

import java.util.Arrays; 

public class StringExerciseRotateByK { 
    private static void rotate(int[] arr, int k) { 
        int[] temp = new int[k]; 
        for (int i = 0; i < k; i++) { 
            temp[i] = arr[i]; 
        } 
        for (int i = k; i < arr.length; i++) { 
            arr[i - k] = arr[i]; 
        } 
        for (int i = (arr.length - k); i < arr.length; i++) { 
            arr[i] = temp[i - (arr.length - k)]; 
        } 
    } 
    public static void main(String[] args) { 
        int[] arr = {1, 2, 3, 4, 5, 6, 7}; 
        int k = 3; 
        rotate(arr, k); 
        System.out.println(Arrays.toString(arr)); 
    } 
} 
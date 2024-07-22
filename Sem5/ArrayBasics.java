package Sem5;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
        //basics
    //     int[] numbers = {1,2,3,4,5}; // array at complie time

    //     System.out.print("array = ");
    //     for (int i = 0; i < numbers.length; i++) {
    //         System.out.print(numbers[i]+" ");
    // }


    Scanner sc= new Scanner(System.in);
    System.out.print("Enter number of variables: ");
    int n = sc.nextInt();
    System.out.print("Enter variables: ");
    int [] arr = new int[n];      //array usage time
    // int[] arr = new sc.nextInt();  // anonymous variable type input
    for (int i = 0; i < arr.length; i++) {
        arr[i] = sc.nextInt();
    }  
    // for (int i = 0; i < arr.length; i++) {
    //     System.out.print(arr[i]+" ");
    // }
    // System.out.println(" ");
    // for (int j : arr) {    // foreach method
    //     System.out.print(arr[j]+" ");
    // }

    System.out.println(Arrays.toString(arr));  // it uses array property and  convert it to string and then print the output in a songle line withou t using the for loop
    
    

        }

        
    
}

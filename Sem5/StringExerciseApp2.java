package Sem5;

import java.util.Arrays;

public class StringExerciseApp2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,-7,-8,-9};
        int n= arr.length;
        int[] temp = new int[n];
        int i=0 ,j =n-1;
        for (int k = 0; k < temp.length; k++) {
            if(arr[k]%2!=0){
                temp[i++]= arr[k];
            }
            else{
                temp[j--]= arr[k];
            }
        }
        for (int k = 0; k < temp.length; k++) {
            arr[k] = temp[k];
        }

        //sort also
        Arrays.sort(arr,0,i);
        Arrays.sort(arr,i,n);
        // System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
    
}

package Sem5;

import java.util.Arrays;

public class string {
    public static void main(String[] args) {

        // sort


        // function that belong to a class is called method otherwise its a function only
        // sort(array,fromindex,toindex)  =  sort from (fromindex) to (toindex -1)
        //int[] num = [4,3,5,6,3,1,4,4]
        // Arrays.sort(num,3,7)       //output = 5,4,3,-1,0,0,1,2
        // Point[] points = {new Point(1,2), new Point(3,4), new Point(-1,-2)};
        // Arrays.sort(points)                // throw error as it sort and compare numbers but not references 

        // search


        //binerysearch()
        int[] num = {5,4,3,2,1,0,-1};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.binarySearch(num, 4));
        System.out.println(Arrays.binarySearch(num, -3));
        System.out.println(Arrays.binarySearch(num, 6));   // -8 as it will look and guess the probabilty of the number then gives output = (num + 1)

        // Comparing
        //equals()    = function
        int[] n1 = {5,4,3,2,1,0,-1};
        int[] n2 = {5,4,3,2,1,0,-1};
        System.out.println(Arrays.equals(n1, n2));

        // Filling arrays
        // fill(array,value)  --function
        int[] nu = new int[8];
        String[] nu2 = new String[8];
        int[] nu1 = new int[8];
        Arrays.fill(nu,2);
        Arrays.fill(nu2,"hello");
        Arrays.fill(nu1,3,7,5);     /// Arrays.fill(array,from,to,with)
        System.out.println(Arrays.toString(nu));
        System.out.println(Arrays.toString(nu1));
        System.out.println(Arrays.toString(nu2));

    }
    
}

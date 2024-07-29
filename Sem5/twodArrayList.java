package Sem5;
// import java.util.ArrayList;
import java.util.*;

public class twodArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>() ;
        System.out.println(arr);
        arr.add(12);
        arr.add(22);
        arr.add(32);
        arr.add(42);
        arr.add(52);
        System.out.println(arr);
        arr.add(1,62);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        arr.remove(Integer.valueOf(22));  // most important
        System.out.println(arr);


        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
System.out.println();
        arr.set(1, 72);
        System.out.println(arr);

        // sorting 
        Collections.sort(arr);
        System.out.println(arr);

        if (!arr.contains(72)) {
            arr.add(72);
            System.out.println(arr);
            
        }
    }
    
    
}

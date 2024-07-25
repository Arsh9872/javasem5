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
    }
    
}

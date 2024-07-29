package Sem5;

import java.util.Scanner;

public class closestFib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        nextFib(n);
    }

    static void nextFib(int n){
        int a=0, b=1;
    while (b<n) {
        int temp = b;
        b = a+b;
        a = temp;
    }
    if((n-a)<(b-a)){
        System.out.println(a);
    }
    else{
        System.out.println(b);
    }
    }
    
}

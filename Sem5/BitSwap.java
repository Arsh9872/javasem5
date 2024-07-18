package Sem5;

public class BitSwap {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;

        b = a^b;
        a = a^b;
        b = a^b;
        System.out.println("a: " + a + ", b: " + b);
    }
}

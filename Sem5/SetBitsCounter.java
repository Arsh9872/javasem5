package Sem5;

public class SetBitsCounter {
    public static int countSetBits(int num) {
        int count = 0;
        while (num != 0) {
            count += num & 1;   // bitwise AND with 1 to check if the rightmost bit is set
            num >>= 1;  // Right shift the number for the next bit
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 3; 
        int res = countSetBits(n);
        System.out.println("Number of set bits in " + n + ": " + res);
    }
    
}

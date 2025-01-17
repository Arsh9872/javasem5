package Sem5;

public class ReverseBit {
    public static void main(String[] args) {
        int n = 43261596; 
        int reversed = reverseBits(n);
        System.out.println("Original: " + n + ", Reversed: " + reversed);
    }

    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;
            result |= (n & 1);
            n >>= 1;
        }
        return result;
        
    }
    
}

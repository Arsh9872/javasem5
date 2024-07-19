package Sem5;

public class BitMissingElement {
    public static void main(String[] args) {
        int[] arr={4,1,3,5};
        int xorAll=0;
        int xorNum=0;
        for (int i = 0; i < arr.length; i++) {
            xorAll=xorAll^arr[i];
            
        }
        for (int i = 1; i < arr.length+1; i++) {
            xorNum = xorNum^i;
        }
        int result = xorAll ^ xorNum;
        System.out.println("Missing num: "+result);
    }
    
}

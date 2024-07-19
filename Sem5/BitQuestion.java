package Sem5;

public class BitQuestion {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,5}; 
        int num1 = 0, num2 =0;

       // 1st part
        int res = 0;

        
        for (int i=0; i< arr.length;i++) {
            res ^= arr[i];
        }

        System.out.println("element that occurs an odd number of times: " + res); // output = 6 :(3^5)


        // 2nd part - to find first set bit
        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if ((res&(1<<i))>0) {
                pos=i;
                break;    // if we break then it gives 1st set bit if we dont then last set bit
            }
        }
        System.out.println("first set bit is at: "+ pos); // output = 1

        // 3rd part - whic are the 2 different odd numbers that gave 6 as output
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]&(1<<pos))>0) {
                num1 ^= arr[i];
            }
            else{
                num2 ^=arr[i];
            }
            
        }
        System.out.println("first number: "+num1);
        System.out.println("second number is: "+ num2);
        System.out.println("Numbers giving answer are: "+ num1 +" ^ "+ num2 + " = " + res);

    }
    
}

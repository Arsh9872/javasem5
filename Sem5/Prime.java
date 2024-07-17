package Sem5;
import java.util.Scanner;
public class Prime {
    public static void main(StringFirst[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        boolean isprime = true;
        if (n<=1) {
            isprime=false;
        }
        else if (n<=3) {
            isprime= true;
            
        }
        else{
            for (int i = 2; i*i <n; i++) { // i*i = check till sqrt of number
                if(n%i==0){
                    isprime=false;
                }
            }
        }
        if (isprime) {
            System.out.println("Prime");
        }
        else{
            System.out.println("NOt Prime");
        }
        

    }
    
}

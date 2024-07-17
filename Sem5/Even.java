package Sem5;
import java.util.Scanner;
public class Even {
    public static void main(StringFirst[] args) {
        System.out.print("Enter a number: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        // if (n%2==0) {
        //     System.out.println("Even");
            
        // }
        if ((n&1)==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    
}

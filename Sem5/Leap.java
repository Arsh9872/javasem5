package Sem5;
import java.util.Scanner;;
public class Leap {
    public static void main(StringFirst[] args) {
        System.out.print("Enter Year: ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        if((n%4==0 && n%100!=0  ) || n%400==0){
            System.out.println("Leap");
        }
       else{
        System.out.println("Regular");
       }
    }


    
}

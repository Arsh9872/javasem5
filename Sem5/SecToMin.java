package Sem5;
import java.util.Scanner;


public class SecToMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter seconds: ");
        int totalSec = sc.nextInt();

        int hours = totalSec / 3600;
        int remSec = totalSec % 3600;
        int minutes = remSec / 60;
        int seconds = remSec % 60;

        System.out.println("Time:");
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
    }
    
}





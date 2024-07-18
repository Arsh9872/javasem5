package Sem5;

public class StringExercises3 {
    public static String reverseString(String input) {
        // StringBuilder to modify a string 
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        // for (int i = input.length() - 1; i >= 0; i--) {
        //     reversed.append(input.charAt(i));
        // }

        return reversed.toString();
    }
    

    public static void main(String[] args) {
        String message = "Hello World"; 

        String reversedMessage = reverseString(message); 

        System.out.println(reversedMessage); // Output: dlroW olleH 
    }
    
}

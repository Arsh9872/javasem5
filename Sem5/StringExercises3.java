package Sem5;

public class StringExercises3 {
    public static String reverseString(String input) {
        // Create a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
    

    public static void main(String[] args) {
        String message = "Hello World"; 

        String reversedMessage = reverseString(message); 

        System.out.println(reversedMessage); // Output: dlroW olleH 
    }
    
}

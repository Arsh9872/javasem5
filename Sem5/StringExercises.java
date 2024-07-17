package Sem5;

public class StringExercises {
    public static boolean isPalindrome(String input){
        String In = input.toLowerCase();
        int left = 0;
        int right = In.length() - 1;

        while (left < right) {
            if (In.charAt(left) != In.charAt(right)) {
                return false;}
                left++;
            right--;
        }

        return true; 
    }

    public static void main(String[] args) { 

        String word = "radar"; 

        boolean result = isPalindrome(word); 

        System.out.println(result); // Output: true 

    } 
    
}

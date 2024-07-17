package Sem5;

public class StringExercises2 {
    public static int countVowels(String input) {
    
        String In = input.toLowerCase();

        int vowelCount = 0;

        for (int i = 0; i < In.length(); i++) {
            char Char = In.charAt(i);
            if (Char == 'a' || Char == 'e' || Char == 'i' || Char == 'o' || Char == 'u') {
                vowelCount++;
            }
        }

        return vowelCount;
    }




    public static void main(String[] args) { 

        String text = "OpenAI ChatGPT"; 

        int vowelCount = countVowels(text); 

        System.out.println(vowelCount); // Output: 5 

    } 
    
}

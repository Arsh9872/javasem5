package Sem5;

public class BitMissingNumber {

        public static int findMissingNumber(int[] nums) {
            int n = nums.length;
            int xorTotal = 0; // XOR of all numbers from 1 to n
    
            // XOR all numbers from 1 to n
            for (int i = 1; i <= n; i++) {
                xorTotal ^= i;
            }
    
            // XOR all elements in the given array
            for (int num : nums) {
                xorTotal ^= num;
            }
    
            return xorTotal;
        }
    
        public static void main(String[] args) {
            int[] arr = {1,4, 3, 5}; // Example array with a missing number
            int missingNumber = findMissingNumber(arr);
            System.out.println("Missing number: " + missingNumber);
        }
    }
    
    


package Sem5;

public class SumofEachRow2dArray {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            for (int i = 0; i < array.length; i++) {
                int sum = 0;
                for (int j = 0; j < array[i].length; j++) {
                    sum += array[i][j];
                }
                System.out.println("Sum of row " + (i + 1) + ": " + sum);
            }
        }
    }
    
    


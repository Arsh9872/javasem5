package Sem5;

public class MaxOfEachRow2dMatrix {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            for (int i = 0; i < array.length; i++) {
                int max = array[i][0];
                for (int j = 1; j < array[i].length; j++) {
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
                System.out.println("Max of row " + (i + 1) + ": " + max);
            }
        }
    }
    
    


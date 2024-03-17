package lab2;

import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        int rows = 9;
        int columns = 9;

        int[][] arr = new int[rows][columns];

        int k = 1;
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = k;
                    k++;
                }
            }
            else {
                for (int j = columns - 1; j >= 0; j--) {
                    arr[i][j] = k;
                    k++;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

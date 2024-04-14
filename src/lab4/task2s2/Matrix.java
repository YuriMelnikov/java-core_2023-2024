package lab4.task2s2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Matrix {
    public static void m(int[][] matrix) throws ArithmeticException {
        int p = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                p++;
                matrix[i][j] = p;
                System.out.print(matrix[i][j] + ";");
            }
            System.out.println();
        }
    }
    public static void printColumn(int[][] matrix, int column){
        if(column < 0 || column >= matrix[0].length){
            throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером.");
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][column]);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = 3;
        int length = 3;
        int[][] matrix = new int[weight][length];
        m(matrix);

        try {
            System.out.print("Введите номер столбца: ");
            int columnNumber = in.nextInt();
            printColumn(matrix, columnNumber);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите целое число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

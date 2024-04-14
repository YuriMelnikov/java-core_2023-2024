package lab4.task2s1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageArray {
    public static void m(int[] array) throws ArithmeticException {

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = in.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Ошибка: " + e + " - Введите целое число.");
                in.next();
                i--;
            }
        }
        int sum = 0;
        int count = 0;
        double average;
        for (int num : array){
            if(num > 0){
                sum += num;
                count++;
            }
        }
        if(count > 0){
            average = (double) sum / count;
            System.out.println("Среднее арифметическое: " + average);
        } else {
            throw new ArithmeticException("В массиве нет положительных чисел.");
        }
        System.out.print("Массив: ");
        for(int num : array){
            System.out.print(num + ";");
        }
    }

    public static void main(String[] args) {
        try {
            int size = 3;
            int[] array = new int[size];
            System.out.println("размер массива = " + size);
            m(array);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

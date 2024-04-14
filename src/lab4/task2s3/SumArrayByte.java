package lab4.task2s3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumArrayByte {
    public static void m(byte[] array) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            try {
                array[i] = in.nextByte();
                sum += array[i];
            } catch (InputMismatchException e){
                System.out.println("Ошибка: " + e + " - Введите целое число, не превышающее диапазон типа byte.\"");
                in.next();
                i--;
            }
        }
        System.out.println("Сумма элементова массива типа byte: " + sum);
    }
    public static void main(String[] args) {
        try {
            int size = 3;
            byte[] array = new byte[size];
            System.out.println("размер массива = " + size);
            m(array);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

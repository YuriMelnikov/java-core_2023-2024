package lab2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        System.out.println("Размер массива: "+ size);

        int[] array = new int[size];

        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
            System.out.println("Элемент массива: ["+i+"] "+ array[i]);
        }

        int[] arrayNew = array.clone();
        Arrays.sort(arrayNew);

        int min = arrayNew[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min){
                min = array[i];
                System.out.println("Элемент массива: [" + i + "] после сортировки = " + array[i]);
            }
        }
    }
}

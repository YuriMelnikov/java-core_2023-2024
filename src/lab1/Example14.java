package lab1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        double num = in.nextDouble();

        double num1 = num - 1;
        double num2 = num + 1;
        double num3 = Math.pow((num1 + num + num2),2);

        System.out.println("Четыре числа: "+ num1 +"; "+ num +"; "+ num2 +"; "+ num3);
    }
}

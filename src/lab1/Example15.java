package lab1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = in.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        System.out.println("Сумма чисел: "+ sum +"  Разность чисел: "+ difference);
    }
}

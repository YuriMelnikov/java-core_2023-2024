package lab1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текущий год: ");
        int currentYear = in.nextInt();

        System.out.print("Введите год рождения: ");
        int yearOfBirth = in.nextInt();

        int age = currentYear - yearOfBirth;
        System.out.println("Возраст: "+ age);
    }
}

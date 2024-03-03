package lab1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = in.nextInt();

        int currentYear = 2024;
        int yearOfBirth = currentYear - age;
        System.out.println("Ваш год рождения: "+ yearOfBirth);
    }
}

package lab1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Введите ваш год рождения: ");
        int yearOfBirth = in.nextInt();

        int currentYear = 2024;
        int age = currentYear - yearOfBirth;
        System.out.println("Имя: "+ name +"  Возраст: "+age);
    }
}

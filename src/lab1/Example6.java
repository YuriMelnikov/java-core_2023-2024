package lab1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Фамилия: ");
        String surname = in.nextLine();

        System.out.print("Имя: ");
        String name = in.nextLine();

        System.out.print("Отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Hello <"+ surname +", "+ name +", "+ patronymic +">");
    }
}

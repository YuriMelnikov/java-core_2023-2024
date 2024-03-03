package lab1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("День недели: ");
        String weekday = in.nextLine();

        System.out.print("Название месяца: ");
        String month = in.nextLine();

        System.out.print("Дата: ");
        int date = in.nextInt();

        System.out.println(weekday +", "+ date +", "+ month);
    }
}

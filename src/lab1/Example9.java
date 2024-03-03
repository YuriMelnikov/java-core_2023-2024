package lab1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Название месяца: ");
        String month = in.nextLine();

        System.out.print("Количество дней в месяце: ");
        String numberOfDays = in.nextLine();

        System.out.println(month +" содержит "+ numberOfDays +" дней.");
    }
}

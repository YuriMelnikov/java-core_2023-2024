package lab3.example6s2;

import java.util.Scanner;

public class RecursionNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число для перевода в двоичную систему: ");
        int num = in.nextInt();

        String binary = binarySystem(num);
        System.out.println("Двоичное представление числа " + num + ": " + binary);
    }

    public static String binarySystem(int n){
        if (n == 0) {
            return "0";
        } else if (n == 1) {
            return "1";
        } else {
            int remainder = n % 2;
            return binarySystem(n / 2) + remainder;
        }
    }
}

package lab2;

import java.util.Locale;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();
        in.nextLine();

        char[] arrayChar = text.toCharArray();

        long[] arrayInt = new long[arrayChar.length];

        char[] arrayCharNew = new char[arrayChar.length];

        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        text = new String(arrayCharNew);

        System.out.println("Текст после преобразования: " + text);

        System.out.print("Выполнить обратное преобразование? (y/n) ");
        String answer = in.nextLine().toLowerCase();
        if(answer.equals("y")){
            System.out.println("окей");
            for (int i = 0; i < arrayChar.length; i++) {
                arrayInt[i] = arrayChar[i] - shift;
                arrayCharNew[i] = (char) arrayInt[i];
            }
            text = new String(arrayChar);
            System.out.println("Текст после обратного преобразования: " + text);
        }
        else if(answer.equals("n")){
            System.out.println("До свидания!");
        }
        else {
            System.out.println("Введите корректный ответ");
        }
    }
}

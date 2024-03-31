package lab3.example10s6;

import java.util.LinkedList;
import java.util.Scanner;

public class UsingLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество человек в кругу: ");
        int n = in.nextInt();

        long start = System.currentTimeMillis(); //Проверка скорости
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            linkedList.add(i);
        }

        for (Integer array : linkedList){
            System.out.print(array + ";");
        }
        System.out.println();

        int index = 0;
        while (linkedList.size() > 1){
            index = (index + 1) % linkedList.size();
            System.out.println("Вычеркиваем каждого второго человека: " + linkedList.get(index));
            linkedList.remove(index);
        }

        System.out.println("Оставшийся человек под номером: " + linkedList.get(0));
        long end = System.currentTimeMillis();
        System.out.println("Время LinkedList: ");
        System.out.println(end - start);
    }
}

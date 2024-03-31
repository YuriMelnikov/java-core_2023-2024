package lab3.example10s6;

import java.util.ArrayList;
import java.util.Scanner;

public class UsingArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество человек в кругу: ");
        int n = in.nextInt();

        long start = System.currentTimeMillis(); //Проверка скорости
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arrayList.add(i);
        }
        for (Integer array : arrayList){
            System.out.print(array + ";");
        }
        System.out.println();
        int index = 0;
        while (arrayList.size() > 1){
            index = (index + 1) % arrayList.size();
            System.out.println("Вычеркиваем каждого второго человека: " + arrayList.get(index));
            arrayList.remove(index);
        }
        System.out.println("Оставшийся человек под номером: " + arrayList.get(0));
        long end = System.currentTimeMillis();
        System.out.println("Время ArrayList: ");
        System.out.println(end - start);
    }
}

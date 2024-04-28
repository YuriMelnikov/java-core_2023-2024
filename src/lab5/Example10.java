package lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        int num = 500;

        System.out.println("\n" + "Список до: " + "\n");
        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        List<Integer> integersAfter = listMinValue(integers, num);
        System.out.println("\n" + "Список чисел меньше чем '500': " + "\n");
        for(Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> listMinValue(List<Integer> list, int num){
        return list.stream()
                .filter(x -> x < num)
                .collect(Collectors.toList());
    }
}

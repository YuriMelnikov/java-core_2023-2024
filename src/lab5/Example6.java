package lab5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
public class Example6 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Random random = new Random();
        System.out.println();

        System.out.println("\n" + "Список до: " + "\n");
        for (int i = 0; i < 10; i++){
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }
        int num = 5;

        List<Integer> integersAfter = numbersDivisible(integers, num);
        System.out.println("\n" + "Список чисел которые делятся на 5: " + "\n");
        for(Integer i : integersAfter){
            System.out.println(i);
        }
    }
    public static List<Integer> numbersDivisible(List<Integer> list, int num){
        return list.stream()
                .filter(x -> x % num == 0)
                .collect(Collectors.toList());
    }
}

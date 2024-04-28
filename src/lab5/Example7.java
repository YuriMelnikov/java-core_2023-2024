package lab5;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список строк "+
                "и возвращает новый список, содержащий только те строки, "+
                "которые имеют длину больше заданного значения.";
        int num = 8;

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = largeLines(strings, num);
        System.out.println("\n" + "Строки которые имеют длину больше '8': " + "\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> largeLines(List<String> list, int num){
        return list.stream()
                .filter(s -> s.length() > num)
                .collect(Collectors.toList());
    }
}

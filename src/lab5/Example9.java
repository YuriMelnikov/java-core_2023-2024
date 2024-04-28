package lab5;

import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        String string = "Напиш$ите функц%ию, кото@рая приним#ает на вход спи!сок стр5ок " +
                "и возв4ращает новы1й списо2к, сод3ержащий только те ст!роки, " +
                "которые содержат только буквы (бе1з ци*фр !и сим^волов).";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");
        for(String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = largeLines(strings);
        System.out.println("\n" + "Строки которые содержат только буквы: " + "\n");
        for(String e : stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> largeLines(List<String> list){
        return list.stream()
                .filter(s -> s.matches("[а-яА-я]+"))
                .collect(Collectors.toList());
    }
}

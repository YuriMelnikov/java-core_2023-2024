package lab2.Animal;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Тим", 8, "лает", "дворовая немецкая овчарка", "сухой и мясной корм", false);
        System.out.println("Имя:" + dog.getName());
        System.out.println("Возраст: " + dog.getAge());
        System.out.println("Метод издавания звука: " + dog.getSound());
        System.out.println("Порода: " + dog.getBreed());
        System.out.println("Тип корма: " + dog.getTypeFeed());
        System.out.println("Способность летать: " + dog.isAbilityFly());
        System.out.println();
        Cat cat = new Cat("Варя", 8, "мяукает", "дворовая кошка", "сухой и мясной корм", false);
        System.out.println("Имя:" + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Метод издавания звука: " + cat.getSound());
        System.out.println("Порода: " + cat.getBreed());
        System.out.println("Тип корма: " + cat.getTypeFeed());
        System.out.println("Способность летать: " + cat.isAbilityFly());
        System.out.println();
        Bird bird = new Bird("Кирюша", 1, "чирикает", "попугай", "сухой корм", true);
        System.out.println("Имя:" + bird.getName());
        System.out.println("Возраст: " + bird.getAge());
        System.out.println("Метод издавания звука: " + bird.getSound());
        System.out.println("Порода: " + bird.getBreed());
        System.out.println("Тип корма: " + bird.getTypeFeed());
        System.out.println("Способность летать: " + bird.isAbilityFly());
    }
}

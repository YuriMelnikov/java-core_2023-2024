package lab7.example8;
import java.io.*;

// Класс Person, реализующий интерфейс Serializable
class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры для полей
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class SerializableExample {
    public static void main(String[] args) {
        // Создание объекта Person
        Person person = new Person("John Doe", 30);

        // Запись объекта в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.dat"))) {
            oos.writeObject(person);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Восстановление объекта из файла
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.dat"))) {
            Person deserializedPerson = (Person) ois.readObject();
            System.out.println("Object has been deserialized");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

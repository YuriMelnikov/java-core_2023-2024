package lab7.example2;

import lab7.example1s1.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationExample2s7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод данных для объекта Person
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();

        Person person = new Person(name, age);

        try{
            FileOutputStream fileOut =
                    new FileOutputStream("src/lab7/example1/person.json");
            ObjectOutputStream out =
                    new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

package lab7.example1s1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample7 {
    public static void main(String[] args) {
        Person person = new Person("Ivan Ivanov", 30);

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

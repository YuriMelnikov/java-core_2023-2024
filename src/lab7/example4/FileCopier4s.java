package lab7.example4;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier4s {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/lab7/example1/input8s1.txt");
        FileWriter writer = new FileWriter("src/lab7/example1/output8s1.txt");
        int c;
        while((c = reader.read()) != -1){
            writer.write(c);
        }
        reader.close();
        writer.close();
        System.out.println("Файл скопирован успешно!");
    }
}

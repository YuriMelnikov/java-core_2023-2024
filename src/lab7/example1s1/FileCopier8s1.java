package lab7.example1s1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopier8s1 {
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

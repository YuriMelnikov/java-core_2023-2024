package lab7.example2;


import java.io.*;
import java.util.Scanner;

public class CharStreamExample2s3 {
    public static void main(String[] args) {
        //Запись данных в файл
        String fileName = "src/lab7/example1/example_file.txt";
        Scanner in = new Scanner(System.in);
        //String data = "Это данные для записи в файл";
        String data = in.nextLine();
        try (FileWriter writer = new FileWriter(fileName)){
            writer.write(data);
            System.out.println("Данные записаны в файл: " + fileName);
        } catch (IOException e){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }

        //Чтение данных из файла
        try(FileReader reader = new FileReader(fileName)){
            char[] buffer = new char[1024];
            int charRead = reader.read(buffer);
            String readData = new String(buffer, 0, charRead);
            System.out.println("Прочитанные данные: " + readData);
        } catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }

        //Удаление файла
        if(new File(fileName).delete()){
            System.out.println("Файл удален: " + fileName);
        } else {
            System.out.println("Не удалось удалить файл: " + fileName);
        }
    }
}

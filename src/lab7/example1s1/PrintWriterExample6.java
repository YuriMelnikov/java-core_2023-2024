package lab7.example1s1;

import java.io.*;

public class PrintWriterExample6 {
    public static void main(String[] args) {
        String inputFileName = "src/lab7/example1/input6.txt";
        String outputFileName = "src/lab7/example1/output6.txt";
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader(inputFileName));
             PrintWriter printWriter =
                     new PrintWriter(outputFileName, "UTF-8")) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line.toUpperCase());
            }
            System.out.println("Данные записаны в файл: " + outputFileName);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении/записи файла: " + e.getMessage());
        }
    }
}

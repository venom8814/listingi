import java.io.*;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) {
        // Запись в файл
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("Привет, мир!\n");
            writer.write("Это тестовая запись в файл.");
            System.out.println("Данные записаны в файл");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
        }
        
        // Чтение из файла
        try (Scanner scanner = new Scanner(new File("output.txt"))) {
            System.out.println("Содержимое файла:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
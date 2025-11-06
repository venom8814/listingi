import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("test.txt");
        
        if (file.exists()) {
            System.out.println("Файл существует");
            System.out.println("Размер файла: " + file.length() + " байт");
        } else {
            System.out.println("Файл не существует");
            try {
                if (file.createNewFile()) {
                    System.out.println("Файл создан: " + file.getName());
                }
            } catch (IOException e) {
                System.out.println("Ошибка при создании файла: " + e.getMessage());
            }
        }
    }
}
import java.util.Date;
import java.text.SimpleDateFormat;

public class DateDemo {
    public static void main(String[] args) {
        Date currentDate = new Date();
        System.out.println("Текущая дата: " + currentDate);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(currentDate);
        System.out.println("Форматированная дата: " + formattedDate);
    }
}
import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Анна", "Борис", "Виктор", "Галина");
        
        names.sort((s1, s2) -> s1.compareTo(s2));
        
        names.forEach(name -> System.out.println(name));
        
        names.stream()
            .filter(name -> name.startsWith("А"))
            .forEach(System.out::println);
    }
}
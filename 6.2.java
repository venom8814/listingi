public class NumberDemo {
    public static void main(String[] args) {
        double num = 3.14159;
        System.out.println("Округленное число: " + Math.round(num));
        
        double randomNum = Math.random();
        System.out.println("Случайное число: " + randomNum);
        
        System.out.println("Максимум: " + Math.max(10, 20));
        System.out.println("Минимум: " + Math.min(10, 20));
    }
}
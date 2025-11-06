public class RecursionDemo {
    public static int sum(int n) {
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
    
    public static void main(String[] args) {
        System.out.println("Сумма чисел от 1 до 5: " + sum(5));
    }
}
public class ThreadDemo extends Thread {
    private String threadName;
    
    public ThreadDemo(String name) {
        this.threadName = name;
    }
    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(threadName + " - счетчик: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток прерван: " + e.getMessage());
            }
        }
    }
    
    public static void main(String[] args) {
        ThreadDemo thread1 = new ThreadDemo("Поток 1");
        ThreadDemo thread2 = new ThreadDemo("Поток 2");
        
        thread1.start();
        thread2.start();
    }
}
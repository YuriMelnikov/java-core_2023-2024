package lab6;

public class Example4 {
    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++){
            final int threadNum = i;
            Thread t = new Thread(() -> {
                System.out.println("Поток " + threadNum + " запущен.");
            });
            t.start();
        }
    }
}

package lab4.task1;

public class Example8 {
    public static void m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("1 " + e);
        } finally {
            System.out.println("2");
        }
    }
    public static void main(String[] args) {
        m();
    }
}

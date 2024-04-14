package lab4.task1;

public class Example7 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new NullPointerException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);
            //throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}

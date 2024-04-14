package lab4.task1;

public class Example5 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            throw new RuntimeException("ошибка");
        } catch (NullPointerException e) {
            System.out.println("1 " + e);
        } catch (RuntimeException e){
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }
}

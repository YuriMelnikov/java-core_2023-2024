package lab3.example3s1;

public class Recursion {
    private static int step = 0;
    public static void m(int x){
        space();
        System.out.println("" + x + "-> ");
        step++;
        if((2 * x + 1) < 20){
            m(2 * x + 1);
        }
        step--;
        System.out.println("" + x + " <-");
    }
    public static void space(){
        for (int i = 0; i < step; i++) {
            System.out.println(" - ");
        }
    }
    public static void main(String[] args) {
        m(1);
    }
}

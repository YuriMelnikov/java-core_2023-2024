package lab3.example5s1;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    public static int fact(int n){
        System.out.println("n = " + n);
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
            int result = fact(n - 2) + fact(n - 1);
            System.out.println("Результат для n (" + n + "): " + result);
            return result;
        }
    }
}

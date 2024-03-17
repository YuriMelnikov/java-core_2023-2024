package timus.task_1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int res = b - 1;
        int res1 = a - 1;

        out.println(res + " " + res1);
        out.flush();
    }
}

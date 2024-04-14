package timus.task_1264;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int numOfM = m + 1;
        int res = n * numOfM;
        System.out.println(res);
    }
}

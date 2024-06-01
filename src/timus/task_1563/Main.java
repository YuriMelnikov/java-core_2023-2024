package timus.task_1563;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int outCounter = 0;
        int n = in.nextInt();
        ArrayList<String> list = new ArrayList<>();
        String inValue;

        for (int i = 0; i <= n; i++) {
            inValue = in.nextLine();

            if (list.contains(inValue))
                outCounter++;
            else list.add(inValue);
        }
        System.out.println(outCounter);
    }
}

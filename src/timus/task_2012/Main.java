package timus.task_2012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numberTasks = in.nextInt();

        int difference = 12 - numberTasks;

        int time = difference * 45;
        if(time <= 240){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

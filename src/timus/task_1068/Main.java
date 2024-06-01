package timus.task_1068;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(in.hasNext()){
            int N = in.nextInt();
            System.out.println(getSum(N));
        }
    }

    public static int getSum(int N){
        int sum = 0;
        if(Math.max(1, N) != 1){
            for(int i = 1; i <= N; ++i){
                sum += i;
            }
        }
        else{
            for(int i = N; i <= 1; ++i){
                sum += i;
            }
        }
        return sum;
    }
}

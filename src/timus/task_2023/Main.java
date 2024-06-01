package timus.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] firstSym = new char[n];

        int outSteps = 0;
        int ducksPosition = 1;

        for(int i = 0; i < n; i++) firstSym[i] = in.next().charAt(0);

        for(int k = 0; k < n; k++) {
            outSteps += Math.abs(ducksPosition - position(firstSym[k]));
            ducksPosition = position(firstSym[k]);
        }

        System.out.println(outSteps);

    }
    public static int position(char sym) {
        if (sym == 'A' || sym == 'R' || sym == 'O' || sym == 'P')
            return 1;
        else if (sym == 'B' || sym == 'M' || sym == 'S')
            return 2;
        else if (sym == 'D' || sym == 'G' || sym == 'J' || sym == 'K' || sym == 'T' || sym == 'W')
            return 3;
        else return 0;
    }
}

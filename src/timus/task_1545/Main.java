package timus.task_1545;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] dict = new String[n];

        for(int i=0; i<n; i++){
            dict[i] = in.next();
        }

        String k = in.next();

        List<String> japanese = new ArrayList<>();

        for(String i : dict){
            if(i.charAt(0) == k.charAt(0)){
                japanese.add(i);
            }
        }

        for(String i : japanese){
            System.out.println(i);
        }
    }
}

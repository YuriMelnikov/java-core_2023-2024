package lab3.example7s3;


public class RecursionArray {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int num = 0;
        recursionArray(arr1, num);
    }

    public static void recursionArray(int[] arr1, int num) {
        if (num < arr1.length) {
            arr1[num] = num;
            System.out.print(arr1[num]);
            recursionArray(arr1, num + 1);
        }
    }
}

package Sort;

import java.util.Scanner;

public class Sorting {
    public static void main(String args[]) {
        BubbleSort bs = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array elements");
            arr[i] = sc.nextInt();
        }
        bs.sorting( arr);
    }
}
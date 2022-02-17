package sort;

import java.util.Scanner;

public class Sorting {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter array elements");
            arr[i] = sc.nextInt();
        }

        BubbleSort bs = new BubbleSort();
        bs.sorting( arr);
    }
}

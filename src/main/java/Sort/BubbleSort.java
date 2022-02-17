package Sort;



import java.util.Scanner;

    public class BubbleSort {
        BubbleSort(){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter array length");
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<arr.length;i++){
                System.out.print("Enter array elements") ;
                arr[i]=sc.nextInt();
            }
            System.out.println("Before Sorting ");
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }
            System.out.println();
            int help;
            for(int i=0;i<arr.length-1;i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        help = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = help;
                    }
                }
            }

            System.out.println("After Sorting ");
            for(int i=0;i<arr.length;i++) {
                System.out.println(arr[i]);
            }


        }
    }



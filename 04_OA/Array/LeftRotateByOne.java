import java.util.Scanner;

public class LeftRotateByOne {

    public static int[] leftRotateByOne(int[] arr) {

       int n = arr.length;
       int first = arr[0];
       for(int i=1; i<n; i++)
       {
        arr[i-1] = arr[i];
       }
       arr[n-1] = first;
       return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        int[] result = leftRotateByOne(arr);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
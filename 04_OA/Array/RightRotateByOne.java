import java.util.Scanner;

public class RightRotateByOne {

    public static int[] rightRotateByOne(int[] arr) {

        // YOUR LOGIC + RETURN HERE
         int end = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--)
          {
           arr[i] = arr[i - 1];
          }

          arr[0] = end;

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

        int[] result = rightRotateByOne(arr);

        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}
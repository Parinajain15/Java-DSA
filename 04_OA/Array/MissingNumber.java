import java.util.Scanner;

public class MissingNumber {

    public static int missingNumber(int[] arr) {

        // YOUR LOGIC + RETURN HERE
        int n = arr.length;
        int expected = n*(n+1)/2;
        int actual = 0;
        for(int i=0; i<n; i++)
        {
            actual = actual + arr[i];
        }
        return expected - actual;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(missingNumber(arr));
    }
}
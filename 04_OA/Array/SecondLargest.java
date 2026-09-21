import java.util.Scanner;

public class SecondLargest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];
        int second = arr[1];

        if (second > largest) {
            int temp = largest;
            largest = second;
            second = temp;
        }

        for (int i = 2; i < n; i++) {

            if (arr[i] > largest) {
                second = largest;
                largest = arr[i];
            }
            else if (arr[i] > second && arr[i] < largest) {
                second = arr[i];
            }
        }

        System.out.print(second);
    }
}
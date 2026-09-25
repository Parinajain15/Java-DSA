import java.util.Scanner;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnes(int[] arr) {

        // YOUR LOGIC + RETURN HERE
        int count = 0;
        int maxcount = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==1)
            {
                count++;
            }
             if(count > maxcount)
           {
              maxcount = count;
           }
            else {
                count = 0;
            }
        }
       
        return maxcount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxConsecutiveOnes(arr));
    }
}
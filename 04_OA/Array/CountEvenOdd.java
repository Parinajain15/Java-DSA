import java.util.Scanner;

public class CountEvenOdd 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int counteven=0;
        int countodd=0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2==0)
            {
                counteven++;
            }
            else
                {
                countodd++;
            }
        }
        System.out.println(counteven + " " + countodd);
    }
}

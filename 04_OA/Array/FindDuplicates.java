import java.util.Scanner;

public class FindDuplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i=0; i<n; i++) 
            {
            arr[i] = sc.nextInt();
            }
        
        for(int i=0; i<n; i++)
            {
                boolean alreadyPrinted = false;

                for(int k=0; k<i; k++)
                {
                    if(arr[k] == arr[i])
                    {
                        alreadyPrinted = true;
                        break;
                    }
                }

                    if(alreadyPrinted)
                    {
                        continue;
                    }

                for(int j=i+1; j<n; j++)
                    {
                       if(arr[j]==arr[i])
                       {
                        System.out.print(arr[i] + " ");
                        break;
                       }
                    }
            }    

    }
}
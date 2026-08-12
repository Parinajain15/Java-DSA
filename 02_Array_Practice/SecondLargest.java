public class SecondLargest
{
    public static void main(String args[])
    {
        int n[] = {1,2,3,4};

        int largest = n[0];

        for(int i = 0; i < n.length; i++)
        {
            if(n[i] > largest)
            {
                largest = n[i];
            }
        }

        int secondLargest = n[0];

        for(int i = 0; i < n.length; i++)
        {
            if(n[i] < largest && n[i] > secondLargest)
            {
                secondLargest = n[i];
            }
        }

        System.out.println("Second Largest = " + secondLargest);
    }
}
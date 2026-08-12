public class AverageOfElements 
{
    public static void main(String args[])
    {
        int n[] = {1,2,3,4,5};
        int sum=0;
        for(int i=0; i<n.length; i++)
        {
            sum = sum + n[i];
        }
            double average = (double) sum/n.length;
            System.out.println(average);

        }
    }

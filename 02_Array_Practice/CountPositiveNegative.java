public class CountPositiveNegative 
{
    public static void main(String args[])
    {
        int n[] = {-2, 5, -7, 3, 0, 8};
        int positive = 0;
        int negative=0;
for(int i=0; i<n.length; i++)
{
    if(n[i]>0)
    {
         positive = positive + 1;
    }
    else if(n[i] < 0)
        {
        negative = negative + 1;
    }
}
System.out.println(" the number of positive numbers are : " + " " + positive + " the no. of negative nos are " + " " + negative);
    }
}

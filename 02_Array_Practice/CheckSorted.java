public class CheckSorted 
{
    public static void main(String args[])
    {
        int n[] = {1,2,3,5,4};
        int sorted = 1;
        for(int i=0; i<n.length-1; i++)
    {
 if (  n[i] > n[i+1])
{
    sorted = 0;
}
    }
    if(sorted == 1)
    {
        System.out.println("Sorted");
    }
    else
        System.out.println("Unsorted");
}
}



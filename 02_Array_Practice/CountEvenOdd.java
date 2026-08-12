public class CountEvenOdd 
{
    public static void main(String args[])
    {
    int n[]={1,3,5,7,8};
    int odd=0;
    int even =0;
    for(int i=0; i<n.length; i++)
    {
        if(n[i]%2==0)
        {
             even = even + 1;
        }
else 
{
     odd = odd + 1;
}
    }
    System.out.print("the no. of even are " + " " + even + " the no. of odd are " + " " + odd);
    }
    
}

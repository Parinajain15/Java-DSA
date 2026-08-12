public class SmallestElement
{
    public static void main(String args[])
    {
int n[] = {8, 3, 12, 1, 6};
int smallest = n[0];
for(int i=0; i<n.length; i++)
{
    if(n[i]< smallest)
    {
        smallest = n[i];
    }
}
System.out.println(smallest);
    }

}

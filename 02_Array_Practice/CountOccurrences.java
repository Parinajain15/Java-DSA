public class CountOccurrences 
{
    public static void main(String args[])
    {
        int n[] = {1,2,1,3,1,4};
        int given = 1;
        int count = 0;
for(int i=0; i<n.length; i++)
{
    if(n[i] == given ) {
        count = count + 1;
    }
}
System.out.println( "the count of occurences of given " + " " + given + " is " + " " + count);
    }
}

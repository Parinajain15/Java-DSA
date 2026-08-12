public class LargestElement
 {
    public static void main(String args[])
    {
        int p[] = {4,7,2,9,1,5};
        int largest = p[0];
        for(int i=0; i<p.length; i++)
        {
            if(p[i] > largest)
            {
                largest = p[i];
            }
        }
        System.out.println(largest);
    }
}

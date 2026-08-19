public class ArrayOfReverseArray 
{
    public static void main(String args[])
    {
    int nums[] = {5, 8, 2, 1, 9, 7};
    int n = nums.length;
    int result[] = new int[n];
    for(int i=0; i<n; i++)
    {
        result[i]=nums[n-i-1];
    }
    for(int i=0; i<result.length; i++)
    {
        System.out.print(result[i] + " ");
    }
    }
}

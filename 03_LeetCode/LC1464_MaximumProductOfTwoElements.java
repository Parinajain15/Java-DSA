public class LC1464_MaximumProductOfTwoElements 
{
    public static void main(String args[])
    {
        int nums[] = {3,4,5,2};
        int max = 0;
        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums.length; j++)
            {
                if (i != j) {
                int result = (nums[i] - 1) * (nums[j] - 1);
                if (result>max) {
                    max = result;
                }
            }

            }
        }
        System.out.println(max);
    }
}

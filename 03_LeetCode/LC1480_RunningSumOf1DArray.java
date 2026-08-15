public class LC1480_RunningSumOf1DArray 
{
    public static void main(String args[])
    {
int nums[] = {1,2,3,4};
int sum = 0;
int ans[] = new int[nums.length];
for(int i=0; i<nums.length; i++)
{
    sum = sum + nums[i]; // 0 = 0 + 1 = 1, // 1 = 1 + 2 = 3...
ans[i] = sum; // i=0 → sum=1  → ans[0]=1 i=1 → sum=3 → ans[1]=3 i=2 → sum=6  → ans[2]=6 ...
}
                  for(int i=0; i<ans.length; i++)
                  {
                    System.out.print(ans[i] + " ");
                  }
    
}
}

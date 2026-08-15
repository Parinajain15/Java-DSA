public class LC1672_RichestCustomerWealth
{
    public static void main(String args[])
    {
    int accounts[][] = {
        {1,2,3},
        {4,5,0}
    };
    //accounts.length = 2;
//accounts[0].length = 3;
   //accounts[1].length = 3;
   int sum = 0;
   int largest = 0;
for(int i =0; i<accounts.length; i++ )
{
for(int j=0; j<accounts[i].length; j++)
{
sum = sum + accounts[i][j]; // 1st sum = 6 . 2nd sum = 9
}
if(sum > largest)
{
    largest = sum; // largest = 6 . 9>6 
}
sum = 0;           // sum reset to 0 . repeat
}
System.out.print(largest); // output 9
}
}

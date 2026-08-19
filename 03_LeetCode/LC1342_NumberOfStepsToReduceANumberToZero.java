public class LC1342_NumberOfStepsToReduceANumberToZero
{
    public static void main(String args[])
    {
        int num=14;
        int step =0;
        while(num>0)
        {
            if(num%2==0)
            {
                num = num/2 ;
                step = step + 1;
            }
            else
            {
                num = num-1;
                step = step + 1;
            }

        }
        System.out.print( step + " " + num);
    }
}
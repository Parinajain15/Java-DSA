public class LC1431_KidsWithTheGreatestNumberOfCandies
{
    public static void main(String args[])
    {
        int extraCandies =3;
        int r;
        int largest =0;
        int candies[] = {2,3,5,1,3};

        for(int i=0; i<candies.length; i++)
        {
            if(candies[i] > largest)
            {
                largest = candies[i];
            }
        }
        boolean result[] = new boolean[candies.length];
        for(int i =0; i<result.length; i++)
        {
            r = candies[i] + extraCandies;
            if( r >= largest)
            {
                result[i] = true;
            }
            else
            {
                result[i] = false;
            }
        }
        for(int i =0; i<result.length; i++)
        {
            System.out.print(result[i] + " ");
        }
          }
           }
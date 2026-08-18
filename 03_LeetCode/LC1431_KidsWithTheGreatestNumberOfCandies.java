import java.util.ArrayList;

public class LC1431_KidsWithTheGreatestNumberOfCandies
{
    public static void main(String args[])
    {
        int candies[] = {2,3,5,1,3};
        int extraCandies = 3;

        int largest = candies[0];

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] > largest)
            {
                largest = candies[i];
            }
        }

        ArrayList<Boolean> ans = new ArrayList<>();

        for(int i = 0; i < candies.length; i++)
        {
            if(candies[i] + extraCandies >= largest)
            {
                ans.add(true);
            }
            else
            {
                ans.add(false);
            }
        }

        System.out.println(ans);
    }
}
public class LC771_JewelsAndStones 
{
    public static void main(String args[])
    {
        String jewels = "aA";
        String stones = "aAAbbbb";

int count = 0;

for(int i = 0; i < stones.length(); i++)
{
    char ch = stones.charAt(i);

    for(int j = 0; j < jewels.length(); j++)
    {
        char jew = jewels.charAt(j);

        if(ch == jew)
        {
            count++;
        }
    }
}

System.out.println(count);

    }
}
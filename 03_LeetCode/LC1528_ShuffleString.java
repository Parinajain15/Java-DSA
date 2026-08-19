public class LC1528_ShuffleString 
{
    public static void main(String args[])
    {
        String s = "codeleet";
        int indices[] = { 4,5,6,7,0,2,1,3 };
        char result[] = new char[s.length()];
        for(int i=0; i<result.length; i++)
        {
            result[indices[i]] = s.charAt(i);  //s.charAt(i) — get a character from a String
        }
        String shuffled = new String(result);
        System.out.println(shuffled);
    }
}

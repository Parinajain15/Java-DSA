public class LC1678_GoalParserInterpretation
{
    public static void main(String args[])
    {
        String command = "G()(al)";
        String result = "";

        for(int i = 0; i < command.length(); i++)
        {
            char ch = command.charAt(i);

            if(ch == 'G')
            {
                result = result + "G";
            }

            else if(ch == '(' && command.charAt(i + 1) == ')')
            {
                result = result + "o";
                i = i + 1;
            }

            else if(ch == '(' && command.charAt(i + 1) == 'a')
            {
                result = result + "al";
                i = i + 3;
            }
        }

        System.out.println(result);
    }
}
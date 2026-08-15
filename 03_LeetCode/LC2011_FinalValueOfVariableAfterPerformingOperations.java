public class LC2011_FinalValueOfVariableAfterPerformingOperations
{
    public static void main(String args[])
    {
      int x = 0;  
String operations[] =
{
     "--x",
      "x++",
       "x++"
};
for(int i=0; i<operations.length; i++)
{
    if(operations[i].equals("--x"))
{
    x=x-1;
}
    else if(operations[i].equals("x--"))
{
    x=x-1;
}
    else if(operations[i].equals("x++") )
    {
        x=x+1;
    }
    else if(operations[i].equals("++x") )
    {
        x=x+1;
    }
}
System.out.println(x);
}
}
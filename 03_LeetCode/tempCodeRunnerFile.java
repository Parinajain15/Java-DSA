for(int i=0; i<operations.length; i++)
{
    if(operations[i].equals("--X"))
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
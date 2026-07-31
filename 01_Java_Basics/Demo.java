class Calculator
{
    public int add(int n1,int n2)
    {
        int r = n1+n2;
        return r;

    }
}

public class Demo
{
    public static void main(String args[])
    {
        int number1=2;
        int number2=8;
        Calculator calc = new Calculator();
        int result= calc.add(number1,number2); 
        System.out.println(result);
    }
}

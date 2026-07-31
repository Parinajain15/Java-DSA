class Calculator 
{
    public int add(int n1, int n2)
    {
return (n1 + n2);
    }
    public double add(double n1, double n2)
    {
        return (n1 + n2);
    }
    public int add(int n1, int n2, int n3)
    {
        return (n1 + n2 + n3);
    }
}
public class Overloading
{
    public static void main(String args[])
    {
        Calculator ov = new Calculator();
int r= ov.add(2,4);
System.out.println(r);
double s = ov.add(4.1,4.4);
System.out.println(s);
int q = ov.add(3,2,1);
System.err.println(q);
    }
}
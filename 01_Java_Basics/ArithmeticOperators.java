class ArithmeticOperators{
    public static void main(String a[])
    {
        
int n=2;
        int m=4;
        int s =n+m;
        int p=n*m;
        int d=n/m;
        int r=n%m;
        System.out.println("sum is "+ s + ", product is " + p + ",division is " + d + ", remainder is " + r);
    
        int num=8;
        num+=num;
        System.out.println(num);

        int x=8;
        //preincrement
        System.out.println(++x);

        int y=8;
        //postincrement
        System.out.println(y++);

        int calc=1;
        System.out.println(++calc + calc++ + calc);

    }
}
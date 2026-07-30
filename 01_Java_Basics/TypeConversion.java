class TypeConversion
{
    public static void main(String a[])
    {
//byte value is 127 max rest all data types are bigger than byte

//type conversion happens automatically/implicitly by the compiler
//type casting must be done manually/explicitly by the programmer

//Type conversion is called Widening
//Type Casting is called Narrowing

int i=12;
byte b= (byte)i;
System.out.println(b);

float p=18.24f;
int t= (int)p;
System.out.println(t);

//Type Promotion when promoted to wider type
byte x=10;
byte y=30;
int result = x*y;
//java automatically converts byte to int when product
System.out.println(result);
}
}
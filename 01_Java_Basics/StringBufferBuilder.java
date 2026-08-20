public class StringBufferBuilder
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("Abhinab");
        sb.append(" Kashyap"); //The same object is modified rather than creating a new String object.
        sb.deleteCharAt(0);
        sb.insert(0,'A');
        System.out.println(sb); 

StringBuilder bb = new StringBuilder("Parina");
bb.append(" Jain");
bb.insert(6, " K");
String result = bb.toString();
System.out.println(result);

//StringBuffer → synchronized, thread-safe
//StringBuilder → not synchronized, generally faster

    }
}

public class ImmutableMutableString 
{
    public static void main(String args[])
    {
        //Immutable : og strings cannot be changed - default in string constant pool
        //Mutable : og strings can be changed through string buffer and builder. 

        String name = "Abhinab"; //address 1 og string
        name = name + " Kashyap"; // address 2 new string

        System.out.println("hello " + name);  // name now refers to that new string 
        // java's garbage collector may later remove og and reclaim memory.

        String s1 = "Abhinab"; // address 3
        String s2 = "Abhinab"; //same address 3 so memory saving
        System.out.println(s1);
        System.out.println(s2);
        
}
}

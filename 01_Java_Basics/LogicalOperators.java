class LogicalOperators {
    public static void main(String args[])
    {
        //true  && true  = true
        //true  && false = false
        // false && true  = false
        //false && false = false

//true  || true  = true
//true  || false = true
//false || true  = true
//false || false = false

        int x=2;
        int y=3;
        int z=4;
        int a=5;
        boolean result = x>y && z>a;
        boolean ans = x<y || z>a;
        System.out.println(result + " " + !ans);
    }
    
}

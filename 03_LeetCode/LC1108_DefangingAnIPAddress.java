public class LC1108_DefangingAnIPAddress {

    public static void main(String args[]) {

        String s = "1.1.1.1";
        String result = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == '.') {
                result = result + "[.]";
            }
            else {
                result = result + ch;
            }
        }

        System.out.println(result);
    }
}
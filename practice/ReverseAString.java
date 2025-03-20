public class ReverseAString {

    public static void main(String[] args) {
        String str = "123";

        System.out.println(reverse(str));
    }

    public static String reverse(String in)
    {
        if (in == null)
        {
            throw new IllegalArgumentException("Null is not valid input.");
        }

        StringBuilder out = new StringBuilder();

        char [] ch = in.toCharArray();
        for (int i = ch.length-1 ; i>=0 ; i--)
        {
            out.append(ch[i]);
        }
        return out.toString();
    }
}

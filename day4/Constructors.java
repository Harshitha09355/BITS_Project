public class Constructors{
    public static void main(String[] args) {
        char[] ch = {'j','s','e','t'};
        String s1 = new String(ch);
        byte[] b = {97,98,99};
        String s2 = new String(b);
        System.out.println(s1 + " " + s2);

        String s = "javaprogrammm";

        s = s.replace('c','j');

        System.out.println(s);

        System.out.println(s.substring(4));
        System.out.println(s.substring(4,6));

    }
}
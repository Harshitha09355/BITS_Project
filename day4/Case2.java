

public class Case2 {
    public static void main(String[] args) {
        String s1 = new String("you cannot change me");
        String s2 = new String("you cannot change me");
        //System.out.println(s1 == s2);
        String s3="You cannot change me";
        String s4="You cannot change me";
       // System.out.println(s4 == s4);
       String s5="You cannot" + "change me";
       //System.out.println(s4 == s5);
       String s6="You cannot";
       String s7=s6+"change me";
       System.out.println(s4 == s7);
}
}
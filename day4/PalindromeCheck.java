public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "Racecar";
        str = str.toLowerCase();
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        if(str.equals(reversed))
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
}

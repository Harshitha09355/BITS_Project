public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        
        if(areAnagrams(str1, str2))
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }
    
    public static boolean areAnagrams(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        
        if(s1.length() != s2.length())
            return false;
        
        int[] count = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        
        for(int c : count) {
            if(c != 0)
                return false;
        }
        
        return true;
    }
}
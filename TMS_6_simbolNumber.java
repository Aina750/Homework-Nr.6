import java.util.HashSet;
import java.util.Set;

public class TMS_6_simbolNumber {
    public static void main(String[] args) {
        String s = "fffff ab f 1234 jkjk";
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < s.length(); ++i) {
            set.add(s.charAt(i));
        }
        System.out.println(set.size());
    }
}
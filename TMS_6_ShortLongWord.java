import java.util.Arrays;
import java.util.Comparator;

public class TMS_6_ShortLongWord {
    public static void main(String[] args) {
        String s = "Сегодня солнечный день";
        System.out.println(Arrays.stream(s.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
        System.out.println(Arrays.stream(s.split(" ")).min(Comparator.comparingInt(String::length)).orElse(null));

    }

}





import java.util.Locale;

public class TMS_6_PutInLine {
    public static void main(String[] args) {
        String str = "1324 abc 5647 bnh 8790";

        String[] array = str.split(" ");
        for (String item : array) {
            System.out.println(item);
        }


        if (str.startsWith("555")) {
            System.out.println("yes");
        }
        if (str.endsWith("1a2b")) {
            System.out.println("yes");
        }
        System.out.println(str.replaceAll("[abc,nh]", "*"));
        System.out.println(str.toUpperCase(Locale.ROOT));
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(0, 10));


         StringBuilder builder = new StringBuilder("1324 abc 5647 bnh 8790");
         builder.replace(0, 22, "abc bnh");
         String result = builder.toString();
         System.out.println(result);


    }




    }


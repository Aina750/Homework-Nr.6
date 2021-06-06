public class TMS_6_polidrom {
    public static void main(String[] args) {
        StringBuffer strBuf1 = new StringBuffer("summer");
        StringBuffer strBuf2 = new StringBuffer("summer");
        strBuf2.reverse();


        System.out.println(strBuf2);
        System.out.println((strBuf1.toString()).equals(strBuf2.toString()));
        if ((strBuf1.toString()).equals(strBuf2.toString()))
            System.out.println("palindrome");
        else
            System.out.println("not a palindrome");



    }
}
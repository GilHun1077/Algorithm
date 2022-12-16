package programmers;

public class CenterChar {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "qwer";

        System.out.println(getCenterChar(s1)+", "+getCenterChar(s2));
    }

    public static String getCenterChar(String s){
        int length = s.length();
        if(length%2 != 0) return String.valueOf(s.charAt((int)length/2));

        return s.substring(length/2-1,length/2+1);
    }
}

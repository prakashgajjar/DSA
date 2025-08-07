
public class StringCompare {

    public static void main(String[] args) {
        String s1 = "hellba";
        String s2 = "hellb";

        System.out.println(compareTo(s1, s2));
    }

    public static int compareTo(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        for (int i = 0; i < min; i++) {
            int count = 0;
            if (str1.charAt(i) > str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }
        
    }
}

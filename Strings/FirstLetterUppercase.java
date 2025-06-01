public class FirstLetterUppercase {

    public static void main(String args[]) {
        String str = "hello world";
        String[] str1 = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str1.length; i++) {
            if (str1[i].length() > 0) {
                // Capitalize the first letter + add the rest of the word
                String word = str1[i].substring(0, 1).toUpperCase() + str1[i].substring(1);
                result.append(word).append(" ");
            }
        }

        System.out.println(result.toString().trim()); // Output: Hello World
    }
}

public class Palindrome{
    public static void main(String args[]){
        String str = "abbbbbbbbba";
        palindromeCheck(str);
    }
    public static void palindromeCheck(String str){
        int full = str.length();

        if(full%2 == 0){
            System.out.println("not palindrome !");
            return;
        }

        boolean flag = true;

        for (int i = 0; i <full; i++) {
            if(str.charAt(i) != str.charAt(full-i-1)){
                flag = false;
            }
        }

        if(!flag){
            System.out.println("not palindrome!");
        }else{
            System.out.println("String is palindrome");
        }

    }
}
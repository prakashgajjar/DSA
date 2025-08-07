import java.util.*;

public class DuplicatePara {
    public static void main(String[] args) {
        String str = "((((2+2)-1)+b)+h)";
        Stack<Character> s1 = new Stack<>();
        boolean output = false;
        
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);
            if(s1.isEmpty()){
                s1.push(ch);
            }else{
                if(ch == ')'){
                    char top = s1.pop();
                    while(top != '('){
                       top = s1.pop();
                       count++;
                    }

                    if(count == 1 || count==0){
                       output = true;
                    }
                }else{
                    s1.push(ch);
                }
            }
        }

        if(output){
            System.out.println("Duplicate found");
        }else{
            System.out.println("Duplicate not found");

        }

    }
}

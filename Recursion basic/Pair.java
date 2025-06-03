public class Pair{
    public static void main(String[] args) {
        int  n = 5;
        System.out.println(pair(n));
    }

    public static int pair(int n){
        if ( n==1 || n==2) {
            return n;
        }
        return pair(n-1) + (n-1)*pair(n-2);
    }
}
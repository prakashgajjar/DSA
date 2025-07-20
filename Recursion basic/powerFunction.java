public class powerFunction {
    public static void main(String args[]){
    int result = power(3,5);
    System.out.println(result);
    }
    public static int power(int a , int n){
        if(n==0 ){
            return 1;
        }
        if(n%2==0){
           return power(a,n/2) * power(a,n/2);
        }else {
           return power(a,n/2) * power(a,n/2) * a;
        }
    }
}

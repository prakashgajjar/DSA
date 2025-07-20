public class PowerFunction2 {

        public static void main(String args[]){
            int result = power(3,5);
            System.out.println(result);
        }
        public static int power(int a , int n){
            if(n==0 ){
                return 1;
            }
                int half = power(a,n/2);
            if(n%2==0){
                return half * half;
            }else {
                return  half * half * a;
            }
        }
    }



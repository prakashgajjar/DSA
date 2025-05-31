public class KadanAlgoSum {
    public static void main(String args[]){
        int arr[] = {-1,-2,5,6,-2,3};
        System.out.println(kadanAlgoSum(arr));
    }
    public static int kadanAlgoSum(int arr[]){
        int max = Integer.MIN_VALUE;
        
        int cs = 0;
        for (int i = 0; i < arr.length; i++) {
            cs = cs + arr[i];
            if(cs < 0){
                cs =0;
            }
            max = Math.max(cs, max);
        }
        return max;
    }
}

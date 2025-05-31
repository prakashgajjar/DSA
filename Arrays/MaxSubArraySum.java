public class MaxSubArraySum {
    public static void main(String args[]){
        int arr[] = {1,2,-1,4,5,3};
        
        int max =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum=0;
               for (int k = i; k <= j; k++) {
                   sum+=arr[k];
               }
               if(sum >max){
                max = sum;
               }
            }
        }
        System.out.println(max);
    }
}

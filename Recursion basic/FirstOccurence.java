public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,7,4,4,9,2,4,1};
        int number = 9;
        int i=0;
        int result = firstOccurence(arr , number , i);
        System.out.println(result);
    }

    public static int firstOccurence(int arr[] , int number , int  i) {
        if(arr.length == 0){
            return -1;
        }

        if(arr.length-1 == i){
            return -1;
        }

        if(number == arr[i]){
            return i;
        }

        return firstOccurence(arr, number, i+1);
    }
}

public class BinarySearch {
    public static void main(String args[]) {
        int arr[]  = {1,2,4,5,6,7,8,9,10,11,13,14,15};
        int index = binarySearch(arr , 9);
        System.out.println(index);
    }

    public static int binarySearch(int arr[], int num) {
        int start = 0;
        int end  = arr.length - 1;
        int mid = 0;
        while(start <=end){

            mid  = start + (end-start)/2;

            if(arr[mid] == num)
                return mid;

            else if (arr[mid] > num) {
                end = mid -1 ;
            }
            else {
                start = mid +1;
            }
        }
        return mid;
    }
}

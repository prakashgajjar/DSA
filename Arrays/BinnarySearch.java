

public class BinnarySearch {
    public static void main(String args[]){
        int arr[] = {1,4,6,8,9,12,56,89};
        int find = 8;
        int value = binnarySearch(arr, find);
        System.out.println("Element found at index: " + value);
    }

    public static int  binnarySearch(int arr[] , int find){
        int start = 0 ;
        int end = arr.length - 1 ;
        while (start <= end) { 
            int mid = (start + end)/2;

            if(find == arr[mid]){
                return mid +1 ; 
            }
            if(find > arr[mid]){
                start = mid-1 ;
            }else{
                end = mid ;
            }

        }
        return -1; 
    }
}

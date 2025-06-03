public class CheckArraySorted {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int i = 0;
        boolean value = checkArraySorted(arr, i);
        System.err.println(value);
    }
    public static boolean checkArraySorted(int arr[] , int i){
        if(arr.length-1 == i){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }        
        return checkArraySorted(arr, i+1);
    }
}

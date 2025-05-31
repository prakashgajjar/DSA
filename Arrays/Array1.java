public class Array1{
    public static void main(String args[]){
        int arr[] = {1,2,3};
        addNumInArray(arr);

        for (int i = 0; i <arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void addNumInArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] +1;
        }
    }
}
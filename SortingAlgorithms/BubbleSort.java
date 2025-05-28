

public class BubbleSort {
    public static void main(String args[]){
        int array[] = {1,6,2,7,3};
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length -1; j++) {
                 if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                 }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
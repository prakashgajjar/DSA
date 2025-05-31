public class LargestElement{
    public static void main(String[] args) {
        int array[] = {1,2,3,4,7,3,8,0,9,2};
        int max=array[0];
        int index=0;
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
                index = i;

            }
        }
        System.out.println("max element in array is :"+max +" index is :"+index);
    }
}
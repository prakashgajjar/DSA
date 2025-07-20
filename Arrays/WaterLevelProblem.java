
public class WaterLevelProblem {

    public static void main(String[] args) {
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        boolean value = waterLevelProblem(arr);
        if(!value){
            System.out.print("not found !!");
        }
    }

    public static boolean  waterLevelProblem(int arr[]) {
        int num1 = 0;
        int num2 = 0;
        if (arr.length == 0 || arr.length == 1 || arr.length == 2) {
            System.err.println("no area of water here!");
            return false;
        }
        boolean check = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        int area = 0;
        for (int i = 0; i < arr.length; i++) {
            num1 = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if(num1 <= arr[j]){
                    int min = Math.min(num1, arr[j]);
                    for (int k = i; k <=j; k++) {
                     area+= min-arr[k];
                    }
                    num1 = arr[j];
                }
            }
        }
        System.out.println("area is : " + area);
        return  true;
    }
}

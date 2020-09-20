public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {11,3,4,5,77,2,0,15};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

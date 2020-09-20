import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[] arr = {11,3,4,5,77,2,0,15};

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

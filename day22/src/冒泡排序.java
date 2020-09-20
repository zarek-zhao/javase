public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {11, 3, 4,2, 5, 77, 2, 0, 15};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("----------------");

//        冒泡排序
//        for (int i = 0; i < arr.length - 2; i++) {//只需要排序length - 1次，所以 i < arr.length - 2  因为length - 2 - 0 + 1 = length - 1
//            for (int j = 0;j < arr.length - 1 - i;j++){//只需要比较length - 1 - i次
//                if(arr[j] > arr[j+1]){
//                    arr[j] = arr[j] + arr[j+1];
//                    arr[j+1] = arr[j] - arr[j+1];
//                    arr[j] = arr[j] - arr[j+1];
//                }
//            }
//        }

//        正向考虑i值和逆向考虑i值都可以
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0;j < i;j++){
               if(arr[j] > arr[j+1]){
                   arr[j] = arr[j] + arr[j + 1];
                   arr[j + 1] = arr[j] - arr[j + 1];
                   arr[j] = arr[j] - arr[j + 1];
               }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



}

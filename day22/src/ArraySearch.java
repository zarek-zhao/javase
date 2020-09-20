import java.util.Arrays;

public class ArraySearch {
    //    数组的元素查找
    //数组的查找方式有两种
//    第一种：遍历查找，效率较低
//    第二种：二分(折半)查找，效率较高
    public static void main(String[] args) {
        int[] arr = {11, 3, 4,2, 5, 77, 2, 0, 15};
        ArraySearch arraySearch = new ArraySearch();
        arraySearch.selectSort(arr);
        System.out.println(arraySearch.BinarySearch(arr,12));
    }

    public boolean Search(int[] array,int element){
        for (int i = 0; i < array.length - 1; i++) {
            if(element == array[i])return true;
        }
        return false;
    }

    //二分查找法
    public int BinarySearch(int[] array,int element){
        int begin = 0;
        int end = array.length - 1;


        while(begin <= end){
            int middle = (begin + end) / 2;
            if(array[middle] == element)return middle;
            if(array[middle] < element){
               end = middle - 1;
            }
            if(array[middle] > element){
                begin = middle + 1;
            }
        }

        return -1;
    }

    //选择排序
    public void selectSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i;j< arr.length;j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

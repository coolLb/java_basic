import java.util.Arrays;

/**
 * @author 刘兵
 * @desc 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] s = {3, 6, 8, 5, 1, 9, 2};
        quickSort(s, 0, s.length - 1);
        System.out.println(Arrays.toString(s));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int low = start;
            int high = end;
            int standard = arr[low];
            while (low < high) {
                while (low < high && standard < arr[high]) high--;
                if (low < high) arr[low++] = arr[high];
                while (low < high && standard > arr[low]) low++;
                if (low < high) arr[high--] = arr[low];
            }
            arr[low] = standard;
            quickSort(arr, start, low - 1);
            quickSort(arr, low + 1, end);
        }
    }
}

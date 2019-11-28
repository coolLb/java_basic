import java.util.Arrays;

/**
 * @desc 插入排序
 */
public class InsertSort {

    public static void main(String[] args) {
        Integer[] s = new Integer[]{1,5,8,3,2,9,6};
        insertSort(s);
        insertSort(s);
        System.out.println(Arrays.toString(s));
    }

    /**
     * 自己
     * @param s
     */
    private static void insertSort(Integer[] s) {
        int temp = 0;
        for (int i = 1; i <= s.length-1; i++) {
            for (int j = 0; j < i; j++) {
                if (s[i] < s[j]) {
                    temp = s[i];
                    for (int k = i-1; k >= j; k --) {
                        s[k+1] = s[k];
                    }
                    s[j] = temp;
                }
            }
        }
    }

    /**
     * 标准
     * @param arr
     */
    public static void insertSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for(j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;
            }
        }

    }
}

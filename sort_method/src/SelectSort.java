import java.util.Arrays;

/**
 * @desc 选择排序
 * @author 刘兵
 */
public class SelectSort {

    public static void main(String[] args) {
        int [] s = {3,6,8,5,1,9,2};
        selectSort(s);
    }

    /**
     * 依次找出第一小，第二小..第n-1小的元素的位置索引，与当前index为0,1..n-2的比较
     * @param s
     */
    private static void selectSort(int[] s) {
        int temp = 0;
        int index = 0;
        for (int i = 0; i < s.length-1; i++) {
            index = i;
            for (int j=i+1 ; j <= s.length-1; j++) {
                if (s[index] > s[j]) {
                    index = j;
                }
            }
            if (index != i) {
                temp = s[i];
                s[i] = s[index];
                s[index] = temp;
            }
        }
        System.out.println(Arrays.toString(s));
    }
}

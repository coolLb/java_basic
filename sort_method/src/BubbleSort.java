import java.util.Arrays;

/**
 *
 * @desc 冒泡排序
 * @author  刘兵
 *
 */
public class BubbleSort {

    public static void main(String[] args) {
        Integer[] s = new Integer[]{1,5,8,3,2,9,6};
        Integer[] s1 = new Integer[]{1,5,8,3,2,9,6};
        bubbleSort(s);
        bubbleSort1(s1);
    }

    /**
     * 把最小的数据冒泡到头部
     * 从尾部到头部比较
     * @param s
     */
    private static void bubbleSort1(Integer[] s) {
        int temp = 0;
        for (int i=0; i< s.length-1; i++) {
            for (int j= s.length-1; j > i;j--) {
                if (s[j] <= s[j-1]) {//如果要降序排列直接把这个<=改成>=
                    temp = s[j];
                    s[j] = s[j-1];
                    s[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }

    /**
     * 依次把最大，第二大，第n大的数据冒泡到尾部
     * 从头部到尾部比较
     * @param s
     */
    private static void bubbleSort(Integer[] s) {
        int temp = 0;
        //控制循环次数s.length-1次
        for (int i =0; i < s.length-1; i++) {
            //控制比较的数据个数s.length-i
            for (int j=0;j < s.length-1-i; j++) {
                if (s[j] >= s[j+1]) {
                    temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}

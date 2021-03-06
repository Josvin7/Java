import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Sort
 * @Description  插入排序  希尔排序
 * @Author by房文辉
 * @Date 2020/5/20 23:29
 */
public class Sort {
    // 以升序排序为例
    public static void insertSort(int[] array) {
        // 有序区间: [0, bound)
        // 无序区间: [bound, size)
        for (int bound = 1; bound < array.length; bound++) {
            // 处理 bound 位置的元素如何往前插入
            int tmp = array[bound];
            // 需要从后往前, 找到合适的位置进行插入.
            int cur = bound - 1;
            for (; cur >=0; cur--) {
                // 如果这里的条件写成了 array[cur] >= tmp, 此时就是不稳定排序了
                if(array[cur] > tmp) {
                    // tmp 元素还需要往前去找. 同时就需要把 cur 位置的元素往后搬运
                    array[cur + 1] = array[cur];
                } else {
                    break;
                }
            }
            array[cur + 1] = tmp;
        }
    }

    public static void shellSort(int[] array) {
        int gap = array.length /2;
        while (gap > 1) {
            insertSortGap(array, gap);
            gap = gap / 2;
        }
        insertSortGap(array, 1);
    }
    // 分组情况下, 同组的相邻元素下标差 gap
    private static void insertSortGap(int[] array, int gap) {
        // 从每组的 [1] 的元素开始.
        for (int bound = gap; bound < array.length; bound += gap) {
            int tmp = array[bound];
            int cur = bound - gap;// bound 位置中相邻的前一个元素下标
            for ( ; cur >= 0; cur -= gap) {
                if (array[cur] > tmp) {
                    // 进行搬运, 把 cur 位置的元素搬到 cur + gap 位置
                    array[cur + gap] = array[cur];
                } else {
                    break;
                }
            }
            array[cur + gap] = tmp;
        }
    }


    public static void main(String[] args) {
        int[] array = {32, 1, 3, 34, 4, 5, 8, 9, 87, 65, 43, 23};
        //insertSort(array);
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }

}

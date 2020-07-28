package java_20200728;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test2
 * @Description
 * @Author by小房
 * @Date 2020/7/28 23:29
 */
public class Test2 {
    public void reOrderArray(int [] array) {
        int k = 0; // 在这里采用插入排序的思想，k 在这里控制奇数的个数也就是下标，第一个奇数插在 0 号下标，那么第二个奇数就插在1号下标
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) { //利用位运算判断奇数还是偶数
                int tmp = array[i]; //临时存一下奇数，后边将奇数放在k 位置
                int j = i;
                // 将找到的奇数平移到 k下标
                ////将该奇数之前的内容(偶数序列)，整体后移一个位置
                while (j > k) {
                    array[j] = array[j-1];
                    j--;
                }
                // 把 tmp 放在 k 下标
                array[k] = tmp;
                k++; //k 相当于奇数个数-1
            }

        }

    }
}

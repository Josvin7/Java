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
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if((array[i] & 1) == 1){
                int temp = array[i];
                int j = i;
                while(j > k){
                    array[j] = array[j-1];
                    j--;
                }
                array[k++] = temp;
            }
        }

    }
}

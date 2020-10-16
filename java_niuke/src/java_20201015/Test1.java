package java_20201015;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName Test1
 * @Description
 * @Author by小房
 * @Date 2020/10/15 22:12
 */
public class Test1 {
    public static void main(String[] args) {
        int m = 90;
        int n = 80;
        int[] array = new int[m];
/*
        for (int i = 1; i < m ; i++) {
            for (int j = 0; j < m-i ; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }


            }

        }*/
        for (int i = 1; i < m ; i++) {
            for (int j = 0; j < m-i ; j++) {
                if (array[i] > array[j]) {
                  //  swap（array[i], array[j]);
                }


            }

        }
    }
}

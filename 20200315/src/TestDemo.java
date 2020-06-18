/**
 * Created with IntelliJ IDEA.
 * @ClassName TestDemo
 * @Description
 * @Author by房文辉
 * @Date 2020/3/15 14:26
 */
public class TestDemo {
    public static int binarySearch(int[] array,int num) {
        int left=0;
        int right=array.length-1;
        while(left<=right) {
            int mid=(left+right)/2;
            if(array[mid]>num) {
                right=mid-1;
            } else if(array[mid]<num) {
                left=mid+1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,543,345};
        int key=3;
        System.out.println(binarySearch(array,key));
    }
}

import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName SeqList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/28 19:05
 */
public class SeqList {
    public int[] elem;
    public int usedSize;
    public static final int DEFAULT_SIZE = 10;
    public SeqList() {
        this.elem = new int [DEFAULT_SIZE];
        this.usedSize = 0;
    }

    // 打印顺序表
    public void display() {
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    private void grow() {
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);
    }
    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()) {
            grow();
        }
        if(pos < 0 || pos > this.usedSize) {
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");
        }
        for (int i =this.usedSize-1; i >=pos ; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    private  boolean isFull() {
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;
    }
    private boolean isNull() {
        if(this.usedSize==0) {
            return true;
        }
        return false;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        if(isNull()) {
            throw new RuntimeException("顺序表为空！");
        }
        for(int i =0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        if(isNull()) {
            throw new RuntimeException("顺序表为空！");
        }
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }

        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(isNull()) {
            throw new RuntimeException("顺序表为空！");
        }
        if(pos<0||pos>this.usedSize-1) {
            System.out.println("此位置不合法！");
            throw new ArrayIndexOutOfBoundsException("pos位置不合法");

        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(isNull()) {
            throw new RuntimeException("顺序表为空！");
        }
        if(pos<0||pos>this.usedSize-1) {
            System.out.println("此位置不合法！");
            return ;
        }
        this.elem[pos]=value;
    }
    //删除第一次出现的关键字key
    public void removeNum(int num) {
        for(int i=num;i<this.usedSize;i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index<0||index>this.usedSize-1) {
            return;
        }
        this.removeNum(index);
    }
    // 获取顺序表长度
    public int size() {
        if(isNull()) {
            return 0;
        }
        return usedSize; }
    // 清空顺序表
    public void clear() {
        if(isNull()) {
            return ;
        }
        this.usedSize=0;
    }
}

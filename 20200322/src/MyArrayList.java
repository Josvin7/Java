import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyArrayList
 * @Description
 * @Author by房文辉
 * @Date 2020/3/22 16:05
 */
public class MyArrayList {
    public int[] elem;//null
    public int usedSize;//0

    //设置默认容量
    public static final int DEFAULT_SIZE = 2;

    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    public void display() {
        for(int i=0;i<this.usedSize;i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();

    }
    public void add(int pos,int date) {
        if(isFull()) {
            grow();
        }
        //
        for(int i=this.usedSize-1;i>=pos;i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=date;
        this.usedSize++;
    }
    public boolean contains(int toFind) {
        if(isNull()) {
            return false;
        }
        for(int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return  false;
    }
    public int search(int toFind) {
        if(isNull()) {
            return -1;
        }
        for(int i=0;i<this.usedSize;i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }
    public int getPos(int pos) {
        if(isNull()) {
            return -1;
        }
        if(pos<0||pos>=this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }
    public void setPos(int pos, int value) {
        if(pos<0||pos>this.usedSize-1) {
            return;
        }
        this.elem[pos]=value;
    }
    public int size() {
        if(isNull()) {
            return 0;
        }
        else {
            return usedSize;
        }
    }
    public void clear() {
        if(isNull()) {
            return;
        }
        usedSize=0;
    }
    public void removeNum(int pos) {

        for(int i=pos;i<usedSize;i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    public void remove(int key) {
        int index=this.search(key);
        if(index<0||index>=this.usedSize) {
            return ;
        }
        this.removeNum(index);
    }
    private  void grow() {
        this.elem= Arrays.copyOf(this.elem,this.elem.length*2);
    }


    public boolean isFull() {
        if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;
    }
    public boolean isNull() {
        if(this.usedSize == 0) {
            return true;
        }
        return false;
    }

}

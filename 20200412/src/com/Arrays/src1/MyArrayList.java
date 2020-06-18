package com.Arrays.src1;

import java.util.Arrays;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName MyArrayList
 * @Description
 * @Author by房文辉
 * @Date 2020/4/12 10:47
 */
public class MyArrayList {
    public int[] elem;
    public int usedSize;

    public static final int DEFAULT_SIZE = 3;


    public MyArrayList() {
        this.elem = new int[DEFAULT_SIZE];
        this.usedSize = 0;
    }
    public void display() {
        for (int i = 0; i <usedSize ; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    private boolean isFull() {
        if(this.usedSize==this.elem.length) {
            return true;
        }
        return false;
    }
    private boolean isEmpty() {
        if(this.usedSize==0) {
            return true;
        }
        return false;
    }
    private void grow() {
        this.elem = Arrays.copyOf(this.elem,this.elem.length*2);

    }
    public void add(int pos,int date) {
        if(isFull()) {
            grow();
        }
        for (int i = this.usedSize-1; i >=pos; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = date;
        this.usedSize++;
    }
    public boolean contains(int toFind) {
        if(isEmpty()) {
            return false;
        }
        for(int i=0;i<usedSize;i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;

    }
    public int getPos(int pos) {
        if(isEmpty()) {
            throw new NullPointerException();
        }
        if(pos<0||pos>=this.usedSize) {
            System.out.println("插入位置不合法！");
            throw new NullPointerException();
        }
        return this.elem[pos];
    }
    public void setPos(int pos, int value) {
        if(isEmpty()) {
            throw new NullPointerException();
        }
        if(pos<0||pos>=this.usedSize) {
            System.out.println("插入位置不合法！");
            throw new NullPointerException();
        }
        this.elem[pos] = value;

    }
    public int size() {
        return usedSize;

    }
    public void clear() {
        if(isEmpty()) {
            return;
        }
        this.usedSize=0;

    }
    public void removeNum(int pos) {
        for(int i=pos;i<usedSize;i++) {
            this.elem[i]=this.elem[i+1] ;
        }
        this.usedSize--;


    }
    public void remove(int key) {
        int index = -1;
        for (int i = 0; i <usedSize ; i++) {
            if (this.elem[i] == key) {
                index=i;
                break;
            }
        }
        if(index==-1) {
            return ;
        }
        removeNum(index);
    }





}

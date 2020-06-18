package com.bit.book;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName BookList
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 20:57
 */
public class BookList {
    public Book[] books;

    private int usedSize;

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }


    public Book getBook(int pos) {
        return books[pos];
    }

    public void setBooks(int pos,Book book){
        this.books[pos] = book;
    }

    public BookList() {
        this.books = new Book[10];
        this.usedSize = 0;
        this.books[0] = new Book("数字信号处理","卢光跃",30,"专业课");
        this.books[1] = new Book("FPGA","17",50,"专业课");
        this.books[2] = new Book("JAVA","18",360,"辅导班");
        this.usedSize = 3;

    }
}

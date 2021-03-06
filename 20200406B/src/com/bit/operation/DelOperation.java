package com.bit.operation;

import com.bit.book.Book;
import com.bit.book.BookList;

import java.util.Scanner;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DelOperation
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:11
 */
public class DelOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍！");
        System.out.println("请输入你要删除的书籍！");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int curSize = bookList.getUsedSize();
        int pos = 0;
        int i;
        for (i = 0;i<curSize;i++) {
            Book book = bookList.getBook(i);
            if(book.getName().equals(name)) {
                pos = i;
                break;
            }
        }
        if(i == curSize) {
            System.out.println("没有你要删除的书籍哦！");
            return;
        }
        //开始删除
        for (int j = pos; j <curSize-1 ; j++) {
            Book book = bookList.getBook(j+1);
            bookList.setBooks(j,book);

        }
        bookList.setUsedSize(curSize-1);
        System.out.println("删除书籍成功！");

    }
}

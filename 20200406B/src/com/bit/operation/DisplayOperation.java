package com.bit.operation;

import com.bit.book.BookList;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName DisplayOperation
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:12
 */
public class DisplayOperation implements IOperation {

    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍！");
        for (int i = 0; i < bookList.getUsedSize(); i++) {
            System.out.println(bookList.getBook(i));
        }

    }
}

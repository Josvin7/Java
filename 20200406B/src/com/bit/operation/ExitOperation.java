package com.bit.operation;

import com.bit.book.BookList;

/**
 * @ Created with IntelliJ IDEA.
 * @ClassName ExitOperation
 * @Description
 * @Author by房文辉
 * @Date 2020/4/6 21:12
 */
public class ExitOperation implements IOperation {


    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统！");
        System.exit(0);

    }
}

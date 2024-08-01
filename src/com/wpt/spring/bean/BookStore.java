package com.wpt.spring.bean;/**
 * @author wpt@onlying.cn
 * @date 2024/7/31 19:38
 */

import java.util.List;

/**
 * @projectName: spring
 * @package: com.wpt.spring.bean
 * @className: BookStore
 * @author: wpt
 * @description: TODO
 * @date: 2024/7/31 19:38
 * @version: 1.0
 */
public class BookStore {
    private List<String> bookList;

    public BookStore() {
    }

    public BookStore(List<String> bookList) {
        this.bookList = bookList;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "BookStore{" +
                "bookList=" + bookList +
                '}';
    }
}

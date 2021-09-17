package com.atguigu.test;

import com.atguigu.dao.BookDao;
import com.atguigu.dao.impl.BookDaoImpl;
import com.atguigu.pojo.Book;
import com.atguigu.pojo.Page;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author k
 * @create 2021-06-06 0:10
 */
public class BookDaoImplTest {
    private BookDao bookDao = new BookDaoImpl();

    @Test
    public void addBoos() {
        bookDao.addBoos(new Book(null, "我为什么那么帅", "站军训", new BigDecimal(45.22), 8888888, 456789, null));
    }

    @Test
    public void deleteBookById() {
        bookDao.deleteBookById(21);
    }

    @Test
    public void updateBook() {
        bookDao.updateBook(new Book(21, "我为什么那么帅", "站军训", new BigDecimal(45.22), 8888888, 55555, null));
    }

    @Test
    public void queryBookById() {
        System.out.println(bookDao.queryBookById(21));
    }

    @Test
    public void queryBooks() {
        bookDao.queryBooks().forEach(System.out::println);
    }

    @Test
    public void queryForPageTotalCount() {
        System.out.println(bookDao.queryForPageTotalCount());
    }

    @Test
    public void queryForPageItems() {
        bookDao.queryForPageItems(8, Page.PAGE_SIZE).forEach(System.out::println);
    }

    @Test
    public void queryForPageTotalCountByPrice() {
        System.out.println(bookDao.queryForPageTotalCountByPrice(50, 10));
    }

    @Test
    public void queryForPageItemsByPrice() {
        bookDao.queryForPageItemsByPrice(0, Page.PAGE_SIZE, 10, 50).forEach(System.out::println);
    }
}
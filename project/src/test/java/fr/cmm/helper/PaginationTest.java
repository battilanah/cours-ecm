package fr.cmm.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class PaginationTest {

    @Test



    public void  ismutiple() {
        Pagination pagination = new Pagination();
        pagination.setPageSize(20);
        pagination.setCount(60);
        assertEquals(3,pagination.getPageCount());

    }
    public void  getPageCount() {
        Pagination pagination = new Pagination();
        pagination.setPageSize(50);
        pagination.setCount(0);
        assertEquals(pagination.getPageCount(),0);

    }

    @Test public void getPages(){
        Pagination pagination = new Pagination();
        pagination.setCount(100);
        pagination.setPageSize(40);


    }
}
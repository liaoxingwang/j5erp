package com.j5erp.bean;

import java.util.List;

public class Pagebean <E>{
    private Integer currentPage;
    private Integer prePage;
    private Integer nextPage;
    private Integer totalPage;
    private Integer totalCount;
    private Integer pageSize;
    private List<E> list;

    public Pagebean() {
    }

    public Pagebean(Integer currentPage, Integer totalCount, Integer pageSize, List<E> list) {
        this.currentPage = currentPage;
        this.totalCount = totalCount;
        this.pageSize = pageSize;
        this.list = list;
        this.totalPage = totalCount%pageSize==0?totalCount/pageSize:(totalCount/pageSize)+1;
        this.prePage = currentPage>1?currentPage-1:1;
        this.nextPage = currentPage<this.totalPage?currentPage+1:this.totalPage;
    }
}

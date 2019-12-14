package com.tulip.code.utils.model;

/**
 * @Author: 杨帆
 * @Date: 2018/10/13 15:48
 * @Description:
 */
public class PageData {
    private int limit = 20;
    private int page = 1;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}

package com.tulip.code.utils.model;

import java.util.List;

/**
 * @Author: 杨帆
 * @Date: 2018/10/13 15:58
 * @Description:
 */
public class PageResult {
    private int code;
    private int count;
    private List data;

    public PageResult(long total, List list) {
        this.count = (int) total;
        this.data = list;
        this.code = 0;
    }

    public PageResult() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List getData() {
        return data;
    }

    public void setData(List data) {
        this.data = data;
    }
}

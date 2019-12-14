package com.tulip.code.utils.model;


import java.util.HashMap;
import java.util.Map;

public class PageMap {

    private int page = 1;
    private int rows = 20;
    private int startIndex;
    private int endIndex;
    private Map<String,Object> condition = new HashMap<String,Object>();

    public PageMap(){
        this.startIndex = 0;
        this.endIndex = rows;
    }

    public PageMap(int page,int rows){
        if(page>1){
            this.startIndex = (page-1)*rows;
            this.endIndex = page*rows;
        }else{
            this.startIndex = 0;
            this.endIndex = rows;
        }
        this.page = page;
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if(page>1){
            this.startIndex = (page-1)*rows ;
            this.endIndex = page*rows;
        }else{
            this.startIndex = 0;
            this.endIndex = rows;
        }
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        if(page>1){
            this.startIndex = (page-1)*rows ;
            this.endIndex = page*rows;
        }else{
            this.startIndex = 0;
            this.endIndex = rows;
        }
        this.rows= rows;
        this.rows = rows;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public Map<String,Object> getCondition() {
        return condition;
    }

    public void setCondition(Map<String,Object> condition) {
        this.condition = condition;
    }

}


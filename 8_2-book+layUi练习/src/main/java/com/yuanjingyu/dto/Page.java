package com.yuanjingyu.dto;

/**
 * 分页查询数据
 */
public class Page {

    private Long count; //总记录数
    private Object obj; //当前数据


    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Page{" +
                "count=" + count +
                ", obj=" + obj +
                '}';
    }
}

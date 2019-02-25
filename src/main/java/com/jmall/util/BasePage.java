package com.jmall.util;

import java.io.Serializable;
import java.util.List;

public class BasePage<T> implements Serializable {

    private long total;
    private List<T> resords;

    public BasePage(long total, List<T> resords) {
        this.total = total;
        this.resords = resords;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getResords() {
        return resords;
    }

    public void setResords(List<T> resords) {
        this.resords = resords;
    }
}

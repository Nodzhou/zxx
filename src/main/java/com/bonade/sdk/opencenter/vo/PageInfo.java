package com.bonade.sdk.opencenter.vo;

public class PageInfo {

    /**
     * 第几页，不传递则默认为第1页
     */
    private int pageNum = 1;

    /**
     * 每页有多少行，不传递则默认为10
     */
    private int pageSize = 10;

    public PageInfo(int pageNum, int pageSize) {
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }

    public PageInfo() {
    }

    public int getPageNum() {
        if (pageNum < 1) {
            pageNum = 1;
        }
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        if (pageSize < 1) {
            pageSize = 10;
        }
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public String toString() {
        return "pageNum:" + pageNum + "_pageSize:" + pageSize;
    }

}

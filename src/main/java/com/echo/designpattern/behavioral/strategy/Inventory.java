package com.echo.designpattern.behavioral.strategy;

/**
 * @author congyou.wu
 * @since 2017-03-30 上午11:13
 */
public class Inventory {

    private int code;
    private String desc;
    private long price;

    public Inventory(int code, String desc, long price) {
        this.code = code;
        this.desc = desc;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}

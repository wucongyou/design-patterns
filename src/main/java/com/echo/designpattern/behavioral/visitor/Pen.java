package com.echo.designpattern.behavioral.visitor;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:37
 */
public class Pen implements Inventory {

    private String name;
    private long price;

    public Pen(String name, long price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public long accept(Visitor visitor) {
        System.out.println(this.getClass().getSimpleName() + " " + name + " " + price + " cent");
        return visitor.visit(this);
    }
}

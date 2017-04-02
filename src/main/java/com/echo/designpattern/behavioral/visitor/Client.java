package com.echo.designpattern.behavioral.visitor;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:44
 */
public class Client {

    public static void main(String[] args) {
        long sum = new ShoppingCart()
            .add(new Book("The little prince", 20000L))
            .add(new Book("Pride and Prejudice", 1900L))
            .add(new Pen("MUJI", 1000L), new Pen("MUJI", 1000L))
            .add(new Pen("LAMY safari", 11900L))
            .calc(new OriginalPriceVisitor());
        System.out.println(sum + " cent");
    }
}

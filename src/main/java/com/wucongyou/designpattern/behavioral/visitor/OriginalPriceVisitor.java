package com.wucongyou.designpattern.behavioral.visitor;

/**
 * @author congyou.wu
 * @since 2017-04-02 下午1:40
 */
public class OriginalPriceVisitor implements Visitor {

    @Override
    public long visit(Book book) {
        return book.getPrice();
    }

    @Override
    public long visit(Pen pen) {
        return pen.getPrice();
    }
}

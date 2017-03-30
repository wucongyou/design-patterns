package com.echo.designpattern.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:52
 */

public class Client {

    public static void main(String[] args) {
        com.echo.designpattern.iterator.Collect<String> c = new CollectImpl<>();
        c.add("pen", "pie", "apple", "pen");
        System.out.println(c.all());
        Iter<String> iter = c.iter();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println(iter.next());
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}

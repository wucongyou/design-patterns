package com.echo.designpattern.behavioral.iterator;

/**
 * @author congyou.wu
 * @since 2017-03-30 下午12:52
 */

public class Client {

    public static void main(String[] args) {
        Collect<String> c = new ListImpl<>();
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
